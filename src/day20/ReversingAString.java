package day20;

import java.util.Scanner;

public class ReversingAString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();

        String reversedName = "";

        for (int i = name.length()-1; i >= 0; i--) {
            reversedName = reversedName + name.charAt(i);
        }

        System.out.println("Reversed name: " + reversedName);

    }
}
