package day17;

import java.util.Scanner;

public class NamePrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scan.nextLine();

        int x = 0;

        while ( x < name.length() ) {
            System.out.println(x + ": " + name.charAt(x));
            ++x;
        }
    }
}
