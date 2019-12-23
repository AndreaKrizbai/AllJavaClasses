package day24;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[]scores = {99,44,66,23,19,55};

        System.out.println(Arrays.toString(scores));


        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(scores));

        System.out.println(scores[0]);

        char[]nameChars = {'G','A','B','E'};
        System.out.println("nameChars = " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("After sorting = " + Arrays.toString(nameChars));


        String[] superHeroes = {"Superman", "Batman", "Wonderwoman", "Aquawoman", "Aquaman", "Flash", "100", "09"};
        System.out.println("Before sorting SuperHeroes: " + Arrays.toString(superHeroes));
        Arrays.sort(superHeroes);
        System.out.println(Arrays.toString(superHeroes));

        boolean[]fiveSwitchOnOffs = {true,false,true,true};
        System.out.println("Arrays.toString(fiveSwitchOnOffs) = " + Arrays.toString(fiveSwitchOnOffs));

        int [] sorting = {130,132,125,150,200};
        long max = sorting[0];
        for (int i = 0; i < sorting.length; i++) {
            if (sorting[i] > max) {
                max = sorting[i];
            } else {
                System.out.println(sorting[i]);
            }
        }
        System.out.println("max = " + max);
    }
}
