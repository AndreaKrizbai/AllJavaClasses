package day17;

import java.util.Scanner;

public class NamePrinterReversed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scan.nextLine();

        int nameIndex = name.length() - 1;

        while (nameIndex >= 0){
            System.out.println(name.charAt(nameIndex));
            --nameIndex;
        }

        System.out.println("Your even letters of your name:");
        while ( nameIndex < name.length() ) {
            if(nameIndex%2 == 0) {
                System.out.println(nameIndex + ": " + name.charAt(nameIndex));
            }
            ++nameIndex;
        }
    }
}
