package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {

        int[] nums = {13,31,8,5,21,2};

//        String numbers = Arrays.toString(nums);
//        Arrays.sort(nums);
//        String numbersSorted = Arrays.toString(nums);
//        System.out.println(numbers.equals(numbersSorted));

        // to preserve the order of the original one
        int[]numsCopy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsCopy[i] = nums[i];
        }

        System.out.println("Before sort numsCopy = " + Arrays.toString(numsCopy));
        Arrays.sort(numsCopy);
        System.out.println("After sort numsCopy = " + Arrays.toString(numsCopy));

        if(Arrays.equals(nums,numsCopy)){
            System.out.println("This array is already sorted");
        } else {
            System.out.println("This array is not already sorted");
        }

    }
}
