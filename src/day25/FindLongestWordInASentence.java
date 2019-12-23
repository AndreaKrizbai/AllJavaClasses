package day25;

import java.util.Arrays;

public class FindLongestWordInASentence {
    public static void main(String[] args) {

        String sentence = "We love Java";

        String[] allWords = sentence.split(" ");
        System.out.println(Arrays.toString(allWords));

        String longestWord = allWords[0];
        //or can be empty String like String longestWord = "";

        for(String currentWord : allWords){
 //           System.out.println("currentWord = " + currentWord);
            if(currentWord.length() > longestWord.length()){
                longestWord = currentWord;
            }
        }
        System.out.println("longestWord = " + longestWord);
    }
}
