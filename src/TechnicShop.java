import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TechnicShop extends Shop{
    private void ReadFromFile(){
        File file = new File("C:\\Users\\Grish\\IdeaProjects\\untitled1\\src\\TechnicShop.txt");
        try(FileReader readerToTechnic = new FileReader(file)){
            Scanner scanToTechnic = new Scanner(readerToTechnic);
            while(scanToTechnic.hasNextLine()){
                String line = scanToTechnic.nextLine();
                String[] productAndPrice = line.split(" ");
                String product = productAndPrice[0];
                int price = Integer.parseInt(productAndPrice[1]);
                tehnicProducts.add(addProduct(product, price));
            }
        }
        catch(IOException ex){
            System.out.println("error" + ex);
        }
    }
    private ArrayList<Product> tehnicProducts = new ArrayList<>();
    public TechnicShop() {
        ReadFromFile();
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








