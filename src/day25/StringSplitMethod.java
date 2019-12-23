package day25;

import java.util.Arrays;

public class StringSplitMethod {
    public static void main(String[] args) {

        String sentence = "I love Java";

        String[] allWords = sentence.split(" ");

        System.out.println(Arrays.toString(allWords));

        System.out.println("How many words do I have in this sentence? " + allWords.length);

        System.out.println("Last word in this sentence is " + allWords[allWords.length-1]);


        String sentence2 = "Everything is Awesome!!!";
        String [] splitByE = sentence2.split("e");
        System.out.println(Arrays.toString(splitByE));

        for(String eachPieces : splitByE){
            System.out.println("eachPieces <" + eachPieces + ">");
        }

        String [] splitByIs = sentence2.split(" is ");
        System.out.println(Arrays.toString(splitByIs));

    }
}
