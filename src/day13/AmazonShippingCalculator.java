package day13;

public class AmazonShippingCalculator {
    public static void main(String[] args) {

        String memberType = "Not prime member";
        double amount = 25.99d;
        int shippingFee = 0;

        if (memberType.equalsIgnoreCase("PRIME MEMBER")) {
            System.out.println("Your final price is " + amount);
            System.out.println("You get free shipping, good for you!");
        } else if (!memberType.equalsIgnoreCase("Prime member") && amount >= 25) {
            System.out.println("Not a prime member but your order is more than 25");
            System.out.println("You get free shipping on amount " + amount);
        } else {
            System.out.println("Do you want to sign up for prime membership?");
            shippingFee = 5;
            amount = amount + shippingFee; //amount += shippingFee
            System.out.println("Your final amount is " + amount);
        }

    }
}
