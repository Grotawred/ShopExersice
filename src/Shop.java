import java.util.ArrayList;


public abstract class  Shop {

    private ArrayList<Product> listOfProducts = new ArrayList<>();


    public Product addProduct(String name, double price) {
        listOfProducts.add(new Product(name, price));
        return new Product(name, price);
    }

    public ArrayList<Product> getProducts() {
        return listOfProducts;
    }

    public void printProducts() {
        for(Product product: listOfProducts) {
            System.out.println(product.toString());
        }
    }
    public double buyProduct(Product product){
        return product.getPrice();
    }
    public ArrayList<Product> getMachedProducts(ArrayList<String> purchaseList){
        ArrayList<Product> found = new ArrayList<>();
        for(String productName : purchaseList){
            for (Product good: this.listOfProducts) {
                if (productName.equals(good.getName())) {
                    found.add(good);
                }
            }
        }
        return found;
    }
}
