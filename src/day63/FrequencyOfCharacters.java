package day63;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AABBBBBBBBACCRDDD";
        Map<Character,Integer>charFreq = new HashMap<>();

//        Integer count = 0;
//        for (int i = 0; i < str.length(); i++) {
//           charFreq.put(str.charAt(i),++count);
//        }

        for (int i = 0; i < str.length(); i++) {
            if (!charFreq.containsKey(str.charAt(i))){
                charFreq.put(str.charAt(i),1);
            } else {
                charFreq.replace(str.charAt(i),charFreq.get(str.charAt(i))+1);
            }
        }
        System.out.println("charFreq = " + charFreq);

//        for (int x = 0; x < str.length(); x++) {
//
//            char currentChar = str.charAt(x);
//            // if we do not have the key yet , it means we are entering for the first time
//            // the count will be 1
//            if (!charFreq.containsKey(currentChar)) {
//                System.out.println("Enter for the first time " + currentChar);
//                charFreq.put(currentChar, 1);
//
//            } else {
//                // if we come to this point it means it has already showed up
//                // so we update the count with 1 extra than existing count
//                charFreq.replace(currentChar, charFreq.get(currentChar) + 1);
//
//            }
//        }
//        System.out.println("charFreq = " + charFreq);


    }
}
