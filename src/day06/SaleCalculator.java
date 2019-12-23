package day06;

import java.util.Scanner;

public class SaleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's the regular price?");
        double regularPrice = input.nextDouble();

        System.out.println("What's the discount?");
        double discount = input.nextDouble();
        double salePrice = regularPrice * (1 - discount);

        System.out.println("Regular price is $" + regularPrice + ", discount is " + discount +
                 " and you got deal for $" + salePrice + ".");

             /*
        you can use:
        double regularPrice, salePrice, discount;

        instead of:

        double regularPrice;
        double salePrice;
        double discount;
         */

    }
}
