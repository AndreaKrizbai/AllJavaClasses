package day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {

        String str = "Finding Words Frequency Sounds Fun Because Fun Comes in When you count Words" +
                " But How do I count the Words with what I already know previously " +
                "Do it and find out Words Words Words";

        String[] allWords = str.split(" ");
        System.out.println("how many words: " + allWords.length);

        Map<String, Integer>wordCount = new HashMap<>();
        for (int i = 0; i < allWords.length; i++) {
            if(!wordCount.containsKey(allWords[i])){
                wordCount.put(allWords[i],1);
            }else{
                wordCount.replace(allWords[i],wordCount.get(allWords[i])+1);
            }
        }
        System.out.println(wordCount);

        Map<String, Integer>wordCount2 = new HashMap<>();
        for (String currentWord : allWords) {
            if(wordCount2.containsKey(currentWord)==false){
                wordCount2.put(currentWord,1);
            } else{
                wordCount2.replace(currentWord,wordCount2.get(currentWord)+1);
            }
        }
        System.out.println("wordCount2 = " + wordCount2);


    }
}
