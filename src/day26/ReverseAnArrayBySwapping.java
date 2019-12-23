package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {
    public static void main(String[] args) {
      int[]myNumbers = new int[]{5,3,21,2,1,13,8, 16, 34, 45, 89, 5556, 3, 3, 3, 5, 889, 0};
        System.out.println(Arrays.toString(myNumbers));

//        System.out.println(myNumbers[0] + " --- " + myNumbers[myNumbers.length-1]);
//        System.out.println(myNumbers[1] + " --- " + myNumbers[myNumbers.length-2]);
//        System.out.println(myNumbers[2] + " --- " + myNumbers[myNumbers.length-3]);

        for (int i = 0; i < myNumbers.length/2; i++) {
            System.out.println(myNumbers[i] + " --- " + myNumbers[myNumbers.length-1-i]);
            int temp = myNumbers[i];
            myNumbers[i] = myNumbers[myNumbers.length-1-i];
            myNumbers[myNumbers.length-1-i] = temp;
        }

        System.out.println("After swap: " + Arrays.toString(myNumbers));



    }
}
