package day05;

import java.util.Scanner;

public class ScannerPractice4_Shopping {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What's the price for a tomato?");
        double tomatoPrice = scan.nextDouble();
        System.out.println("How many tomatoes do you want to buy?");
        int tomatoCount = scan.nextInt();
        System.out.println("Your total for tomato is $" + (tomatoCount*tomatoPrice));

        System.out.println("What's the price for a potato?");
        double potatoPrice = scan.nextDouble();
        System.out.println("How many potatoes do you want to buy?");
        int potatoCount = scan.nextInt();
        System.out.println("Your total for potato is $" + (potatoCount*potatoPrice));

        System.out.println("What's the price for a banana?");
        double bananaPrice = scan.nextDouble();
        System.out.println("How many bananas do you want to buy?");
        int bananaCount = scan.nextInt();
        System.out.println("Your total for banana is $" + (bananaCount*bananaPrice));

        double shoppingSum = tomatoCount*tomatoPrice + potatoCount*potatoPrice + bananaCount*bananaPrice;
        System.out.println("You have spent $" + shoppingSum + " on groceries.");
    }
}
