package day24;

import java.util.Arrays;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {

        int yourFavNumber = 300;
        int myFavNumber = yourFavNumber;

        myFavNumber = 299;
        System.out.println(yourFavNumber);

        long[] nums = {10, 40, 20};

        for (int i = 0; i < 3; i++) {
            System.out.println("Originals: " + nums[i]);
        }

        nums[0] = nums[0] * 2;
        System.out.println("Doubling first item: " + nums[0]);

        for (int i = 0; i < 3; i++) {
            System.out.println("Doubling in the loop: " + nums[i]*2);
        }

        for (int k = 0; k < 3; k++) {
            nums[k] = nums[k] * 2;
            System.out.println("Reassigning: " + nums[k]);
        }
  //      System.out.println(nums[2]);
        System.out.println(Arrays.toString(nums));

        for (int x = 0; x < 3; x++) {
            long eachItem = nums[x];
            eachItem = 100;
        }

        for (long eachItem : nums){
            eachItem = 100;
            eachItem = eachItem * 2;
            System.out.println(eachItem);
//            does nothing, no reason to reassign, you can't modify array item using for each loop
        }
        for (int x = 0; x < 3; x++) {
            System.out.println(nums[x]);
        }
    }
}
