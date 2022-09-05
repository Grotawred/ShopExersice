import java.util.ArrayList;

public class TechnicShop extends Shop{
    private Human husband = new Husband();
    private ArrayList<Product> tehnicProducts = new ArrayList<>();
    public TechnicShop() {
        tehnicProducts.add(addProduct("LenovoNotebook", 120));
        tehnicProducts.add(addProduct("SonyCamera", 100));
        tehnicProducts.add(addProduct("AppleIphone", 400));
        tehnicProducts.add(addProduct("SamsungGalaxy", 250));
        tehnicProducts.add(addProduct("AsusTV", 85));
        tehnicProducts.add(addProduct("XiaomiRedmi", 135));
        tehnicProducts.add(addProduct("AOCMonitor", 50));
    }


    @Override
    public double buyProduct(Product product){
        if(product.getName().equals("SonyCamera")){
            return product.getPrice()*0.3;
        }
        return product.getPrice();
    }

    public ArrayList<Product> getProducts() {
        return tehnicProducts;
    }
}
