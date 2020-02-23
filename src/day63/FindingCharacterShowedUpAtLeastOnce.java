package day63;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindingCharacterShowedUpAtLeastOnce {
    public static void main(String[] args) {

        String str = "The new link for joining class will require you to ling to Okta, if it ask you to " +
                "sign in, please just click on it, it will take you to Okta signing page, once you signing" +
                "with Okta, then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER, THE LINK" +
                "IS ALREADY IN THE EMAIL, Click to join";
//How many unique character showed up in above sentence?

//        Set<String> text = new HashSet<>(Arrays.asList(str.split(" ")));
//        System.out.println(text);

        Set<Character>charSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            charSet.add(str.charAt(i));
        }
        System.out.println("How many character overall? " + str.length());
        System.out.println("How many Unique Characters? " + charSet.size());
        System.out.println("charSet = " + charSet);

        for(Character eachChar : charSet){
            System.out.println("each unique char = " + eachChar) ;
        }









    }
}
