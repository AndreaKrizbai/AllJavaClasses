package Practice.Mentoring.Loops3;

import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[0][0]= 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1] = new int[]{4, 5};
        arr[2] = new int[]{6, 7, 8, 9};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
