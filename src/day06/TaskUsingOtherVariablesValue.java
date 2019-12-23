package day06;

import java.util.Scanner;

public class TaskUsingOtherVariablesValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What do you want to order?");
        String yourOrder = scan.nextLine();
        System.out.println("Your want to order " + yourOrder);
        String myOrder = yourOrder;
        System.out.println("I would like to order " + myOrder + " as well.");

        /*System.out.println("WHAT IS YOUR ORDER ? I WANT THE SAME!");
        String yourOrder = scan.nextLine();
        String myOrder = yourOrder;

        System.out.println("Your order is " + yourOrder + "\n" +
                "My order is " + myOrder);

      Without Scanner:

        String yourOrder = "Gucci Bag";
        String myOrder = yourOrder;
        System.out.println("Your order is " + yourOrder
                + "\nMy order is " + myOrder);
         */
    }
}
