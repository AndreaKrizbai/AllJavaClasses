package Practice;

import java.util.Scanner;

public class StringT8_SentenceMoreThan2Words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a sentence:");
        String sentence = scan.nextLine();
        String trimmedSentence = sentence.trim();

        int firstSpace = trimmedSentence.indexOf(" ");
        int lastSpace = trimmedSentence.lastIndexOf(" ");

        if(firstSpace == lastSpace){
            System.out.println("You have entered two words");
        } else {
            System.out.println("You have more than two words");
        }
        
        
        
        
    }
}
