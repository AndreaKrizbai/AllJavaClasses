package Practice;

import java.util.Scanner;

public class StringT1213_SwampChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word with at least three characters");
        String word = scan.nextLine();

        String newWord = word.charAt(word.length()-1) +
                word.substring(1,word.length()-1)+
                word.charAt(0);

        System.out.println(newWord);

        if (word.equals(newWord)){
            System.out.println("Palindrome");
        }


    }
}
