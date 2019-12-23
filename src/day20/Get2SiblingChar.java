package day20;

import java.util.Scanner;

public class Get2SiblingChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a name:");
        String name = scan.next();

        for (int i = 0; i < name.length()-1; i++) {
            System.out.println(name.substring(i,i+2));
        }
        System.out.println("Getting 3 characters:");
        for (int i = 0; i < name.length()-2; i++) {
            System.out.println(name.substring(i,i+3));
        }
    }

}
