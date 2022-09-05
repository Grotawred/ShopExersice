import java.util.Collections;

public class Wife extends Human {
    private final String[] purchaseList = {"SonyCamera", "LenovoNotebook", "Bread", "Onion"};
    public Husband husband;

    public Wife(Husband husband){
        this.husband = husband;
        addListOfProducts();
        giveListOfProductsToHusband();
    }

    public void giveListOfProductsToHusband() {
        husband.setPurchaseList(getPurchaseList());
    }



    public void addListOfProducts() {
        Collections.addAll(getPurchaseList(), purchaseList);
    }

    public void printInfoAboutWifesListOfProducts(){
        System.out.println("Purchase list received from wife: " + husband.getPurchaseList());
    }

    public void printInfoAboutProductsFromShops(){
        System.out.println("List of products available for purchase: ");
        husband.printProducts(husband.goToShopsForListOFProducts());
    }
    public void printInfoAboutFoundingGoods(){
        System.out.println("\nFound goods from list: ");
        husband.printProducts(husband.goToShopForCreatingListOfFindingGoods());
    }
    public void printInfoAboutTotalPriceOfFoundProductsAndHusbandsMoneyAfterShopping(){
        System.out.println("\nTotal price without discount of found goods: ");
        System.out.println(husband.getTotalPriceWithoutDiscount());
        System.out.println("\nTotal price of found goods: ");
        System.out.println(husband.getTotalPrice());
        System.out.println("Husbands money after shoping: "+ husband.getMoney());
    }


}