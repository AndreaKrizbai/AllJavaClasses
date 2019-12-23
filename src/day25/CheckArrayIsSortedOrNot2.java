package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot2 {
    public static void main(String[] args) {

       int[] nums = {13,31,8,5,21,2};
   //     int[] nums = {13,14,15,16};
        System.out.println("nums = " + Arrays.toString(nums));

        boolean isSortedAlready = true;

        for (int i = 0; i < nums.length-1; i++) {
            System.out.println("Is " + nums[i] + " less than " + nums[i + 1] + "? " + (nums[i] < nums[i + 1]));

            if (!(nums[i]<nums[i+1])){
                System.out.println("Array is not sorted");
                isSortedAlready = false;
                break;
            }
        }
        System.out.println("isSortedAlready = " + isSortedAlready);
    }
}
