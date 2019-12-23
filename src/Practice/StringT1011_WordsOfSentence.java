package Practice;

import java.util.Scanner;

public class StringT1011_WordsOfSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please write a sentence with 3 words:");
        String sentence = scan.nextLine();
        int firstSpace = sentence.indexOf(" ");
        int lastSpace = sentence.lastIndexOf(" ");
        System.out.println("Second word: " + sentence.substring(firstSpace+1,lastSpace));
        System.out.println("First word: " + sentence.substring(0,firstSpace));
        System.out.println("Last word: " + sentence.substring(lastSpace+1));
    }
}
