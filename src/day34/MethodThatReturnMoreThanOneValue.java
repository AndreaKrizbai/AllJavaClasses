package day34;

import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        char[] eachChars = sentence.toCharArray();
        System.out.println(Arrays.toString(eachChars));
        String[] eachWords = sentence.split(" ");
        System.out.println(Arrays.toString(eachWords));

        int[] resultArr = returnBoysVSGirlsResult();
        System.out.println(Arrays.toString(resultArr));

    }

    // create a method that return int array returnBoysVSGirlsResult
    public static int[] returnBoysVSGirlsResult() {
        // after fierce competition
        int[] boysGirlsCount = {57, 57};
        return boysGirlsCount;


    }


}