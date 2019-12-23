package Practice;

import java.util.Scanner;

public class StringT14_LastWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*Ask user to enter sentence with any number of words
For example I love Java Java Java Java
write a program to print last word
remove last word from the sentence
check weather remaining part still contains last word
for example :
1, I love Java Java Java Java  -->> Java
2, I love Java Java Java
3, I love Java Java Java still contains last word

         */
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();

        int lastSpace = sentence.lastIndexOf(" ");
        String sentenceWithoutLast = sentence.substring(0,lastSpace+1);
        String lastWord = sentence.substring(lastSpace+1);
        System.out.println("Sentence without last word: " + sentenceWithoutLast);

        if(sentenceWithoutLast.contains(lastWord)){
            System.out.println(sentenceWithoutLast + " still contains " + lastWord);
        }


    }
}
