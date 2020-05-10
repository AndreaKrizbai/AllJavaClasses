package Practice.Mentoring.Loops3;

import java.util.Arrays;

public class Initialization {
    public static void main(String[] args) {
        int[][] arr = new int[2][];
        double[][] arr2 = new double[][] { {1,2}, {3,4} };
        long[][] arr3 = new long[][] { {1,2}, {3,4} };
        int[][] arr4 = {{'A','B'}, {'C','D'}};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr4[0]));
    }
}
