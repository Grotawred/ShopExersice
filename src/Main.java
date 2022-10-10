public class Main {
    public static void main(String[] args) {

        Husband husband = new Husband(1000);
        Wife wife = new Wife(husband);
        wife.printInfoAboutWifesListOfProducts();
        husband.goToShopsForListOFProducts();
        wife.printInfoAboutProductsFromShops();
        husband.goToShopForCreatingListOfFindingGoods();
        wife.printInfoAboutFoundingGoods();
        husband.goToShopForBuyingProductsFromListOfFindingGoods();
        wife.printInfoAboutTotalPriceOfFoundProductsAndHusbandsMoneyAfterShopping();
    }
}