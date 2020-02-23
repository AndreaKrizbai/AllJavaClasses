package day63;

import java.util.HashMap;
import java.util.Map;

public class WordUtil {
    public static void main(String[] args) {

        String str = "Fun Fun Fun Java Java is Ending Tomorrow Tomorrow No It is never Ending";
        Map<String,Integer>theFrequency = getFrequencyMap(str);
        System.out.println("Frequency: " + theFrequency);
    }


    public static Map<String,Integer> getFrequencyMap(String str){
        Map<String,Integer>wordFreqMap = new HashMap<>();
        String[]allWords = str.split(" ");

        for (String eachWord : allWords) {
            if(wordFreqMap.containsKey(eachWord)==false){
                wordFreqMap.put(eachWord,1);
            }else{
                wordFreqMap.replace(eachWord,wordFreqMap.get(eachWord)+1);
            }
        }
        return wordFreqMap;
    }



}
