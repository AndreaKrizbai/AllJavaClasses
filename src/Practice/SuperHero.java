package Practice;

import java.util.Scanner;

public class SuperHero {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String keyword = "";
        do {
            System.out.println("Enter keyword to turn into SUPERHERO:");
            keyword = scan.nextLine().toUpperCase();
        } while (!keyword.equals("SHAZAM"));
        System.out.println("You are now SUPERHERO");
    }
}
