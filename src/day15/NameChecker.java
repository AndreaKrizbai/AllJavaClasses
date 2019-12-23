package day15;

import java.util.Scanner;

public class NameChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.next();

        System.out.println("Length of the name is " + name.length());
        if (name.length() < 4) {
            System.out.println("short name");
        } else if (name.length() >= 4 && name.length() <= 11) {
            System.out.println("medium name");
        } else {
            System.out.println("longer name");
        }

        if (name.contains("a") || name.contains("e")) {
            System.out.println("Name contains a or e");
        } else {
            System.out.println("Name doesn't have either a or e in it");
        }


    name = "Andrea";
        for (int i = (name.length() - 1); i >= 0; --i) {
            System.out.println("" + name.charAt(i));
        }


        System.out.println("" + name.charAt(5)+name.charAt(4)+name.charAt(3) +
                name.charAt(2) + name.charAt(1) + name.charAt(0));
    }
}
