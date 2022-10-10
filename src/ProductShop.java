import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class ProductShop extends Shop{
    public void ReadFromFile(){
        File file = new File("C:\\Users\\Grish\\IdeaProjects\\untitled1\\src\\ProductShop.txt");
        try(FileReader reader = new FileReader(file)){
            Scanner scan = new Scanner(reader);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                String[] productAndPrice = line.split(" ");
                String product = productAndPrice[0];
                int price = Integer.parseInt(productAndPrice[1]);
                productsProducts.add(addProduct(product, price));
            }
        }
        catch(IOException ex){
            System.out.println("error" + ex);
        }
    }
    private ArrayList<Product> productsProducts = new ArrayList<>();
    public ProductShop() {
        ReadFromFile();
    }

    public ArrayList<Product> getProducts() {
        return productsProducts;
    }
}
