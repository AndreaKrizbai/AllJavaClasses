package day24;

import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {

       String[] superHeroes = {"Superman", "Batman", "Wonderwoman", "Aquaman", "Flash"};
        System.out.println(Arrays.toString(superHeroes));

        System.out.println(Arrays.toString(superHeroes).charAt(0));

        int[]numbers = {10,44,55,3,78};
        System.out.println(Arrays.toString(numbers));

        double[]prices = {8.99, 12.99, 3.49};
        String pricesString = Arrays.toString(prices);
        System.out.println("pricesString = " + pricesString);
        for (int i = 0; i < pricesString.length(); i++) {
            System.out.println("Character at index " + i + " is : " + pricesString.charAt(i));
        }

        }

    }
