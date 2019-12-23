package day16;

import java.util.Scanner;

public class WakeUpTask {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a 4-letter word: ");
        String word = scan.next();

        String word2 = "" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println("word2 = " + word2);

        String word3 = (""+ word.charAt(word.length()-1) + word.charAt(word.length()-2)+ word.charAt(word.length()-3) + word.charAt(word.length()-4));
        System.out.println("word3 = " + word3);

        String word4 = word.substring(3,4)+ word.substring(2,3)+ word.substring(1,2)+ word.substring(0,1);
        System.out.println("word4 = " + word4);

   /*     String msg = "Hello";
        msg = msg + " World";
        msg += " World";
        System.out.println(msg);

    */
    }
}
