package day36;

import java.util.Arrays;

public class MethodWithParameterArray {
    public static void main(String[] args) {
        int[]nums = {1, 5, 3, 4, 7, 2};
        System.out.println("Before sort " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("After sort " + Arrays.toString(nums));
        changeArrayFirstItemTo100(nums);
        System.out.println("After changing " + Arrays.toString(nums));
    }

    public static void changeArrayFirstItemTo100 (int[]numbers){
        numbers[0]=100;
    }
}
