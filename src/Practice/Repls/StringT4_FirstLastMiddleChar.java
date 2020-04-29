package Practice.Repls;

import java.util.Scanner;

public class StringT4_FirstLastMiddleChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word with at least 3 characters:");
        String word = scan.nextLine();

        int middleCharacter;
        if (word.length()%2==0){
            middleCharacter = word.length()/2-1;
        } else {
            middleCharacter = word.length()/2;
        }

        if(word.length() < 3) {
            System.out.println("That's not a word with 3 characters, try again!");
        } else {
            System.out.println("first character: " + word.charAt(0));
            System.out.println("last character: " + word.charAt(word.length()-1));
            System.out.println("middle character: " + word.charAt(middleCharacter));
        }




    }
}
