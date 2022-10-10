import java.util.ArrayList;

public class Husband extends Human {
    private ArrayList<Product> totalListOfProducts = new ArrayList<>();

    private double money;

    private double moneyForAllProducts = 0;
    private ArrayList<Shop> shops;
    public Husband(){}
    public Husband(double money) {
        this.money = 1000;
        System.out.println("Husbands money: "+ money);
        this.shops = getListOfShopsToGo();
    }
    private ArrayList<Shop> getListOfShopsToGo() {
        ArrayList<Shop> shops = new ArrayList<>();
        Shop Elektronika = new TechnicShop();
        shops.add(Elektronika);
        Shop Produkst = new ProductShop();
        shops.add(Produkst);
        return shops;
    }

    public ArrayList<Product> goToShopsForListOFProducts() {
        ArrayList<Product> productsFromAllShops = new ArrayList<>();
        for ( Shop shop : shops ) {
            productsFromAllShops.addAll(shop.getProducts());
        }
        return productsFromAllShops;
    }

    public ArrayList<Product> goToShopForCreatingListOfFindingGoods() {
        ArrayList<Product> foundGoods = new ArrayList<>();
        for ( Shop shop : shops  ) {
            totalListOfProducts.addAll(shop.getProducts());
            foundGoods.addAll(shop.getMachedProducts(purchaseList));
        }
        return foundGoods;
    }

    public void goToShopForBuyingProductsFromListOfFindingGoods() {
        for ( Shop shop : shops )  {
            for ( Product foundProduct : shop.getMachedProducts(purchaseList) ) {
                moneyForAllProducts += shop.buyProduct(foundProduct);
            }
        }
        money = money - moneyForAllProducts;
    }


    public void printProducts(ArrayList<Product> list) {
        for ( Product product : list ) {
            System.out.println(product.toString());
        }
    }

    public double getTotalPrice() {
        return moneyForAllProducts;
    }

    public double getMoney() {
        return money;
    }
    public double getTotalPriceWithoutDiscount(){
        double PriceWithoutDiscount = 0;
        for(Shop shop :shops) {
            for ( Product product : shop.getMachedProducts(purchaseList) ) {
                PriceWithoutDiscount += product.getPrice();
            }
        }
        return PriceWithoutDiscount;
    }
}