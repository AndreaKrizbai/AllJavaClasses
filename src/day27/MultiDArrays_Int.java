package day27;

import java.util.Arrays;

public class MultiDArrays_Int {
    public static void main(String[] args) {

        int[] arr1D = {1, 2, 3};
        int[][] arr2D = { {1,2,3} , {4,5,6} };
        System.out.println(arr2D.length);
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[0][2]);

        System.out.println(Arrays.deepToString(arr2D));

    }
}
