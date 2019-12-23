package day32;

import java.util.Scanner;

public class StringActions {
    public static void main(String[] args) {

        reversePrintMyOwnName();

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        printStringWithDashInBetween(scan.next());

        printStringWithDashInBetween("Hasan");
        printStringWithDashInBetween("Arya");
        printStringWithDashInBetween("Tolkun");
        printStringWithDashInBetween("Lisa");
        printStringWithDashInBetween("Gulbara");

    }
    // printStringWithDashInBetween
    // it has one String parameter called name
    // it will do following in method body
    // print each and every character of a String with dash in between
    // excluding the last one Akbar -->> A-k-b-a-r
    // logic : keep concatenating - after each character
    // when it comes to last character don't add it

    public static void printStringWithDashInBetween(String name) {
        //String name = "Tokun" ;
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            // if I am not at last index then I print -
            if (i != name.length() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();

    }


    /*
    * reversePrintMyOwnName
    * create a method that has no parameter
	    and print your name in reversed order
    * */
    public static void reversePrintMyOwnName() {
        //             01234
        String name = "Akbar";
        name = "Andrea";
        // start from last character and print toward first character
        for (int i = name.length() - 1; i >= 0; i--) {

            System.out.print(name.charAt(i));
        }
        System.out.println();

    }

}
