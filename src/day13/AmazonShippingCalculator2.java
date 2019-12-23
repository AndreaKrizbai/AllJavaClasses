package day13;

public class AmazonShippingCalculator2 {
    public static void main(String[] args) {

        boolean doYouWantToShop = false;
        String preference = "Store";

        if (doYouWantToShop == true) {
            if (preference.equals("Store")) {
                System.out.println("Going to store for shopping");
            } else {
                System.out.println("Going to online for shopping");
            }
        } else {
            System.out.println("Good job - stay home coding!!!");
        }
    }
}
