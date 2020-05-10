package Practice.Mentoring.Loops3;

import java.util.Arrays;

public class NestedLoop {
    public static void main(String[] args) {
        int arr2D[][] = { {1, 2, 3},
                          {4, 5},
                          {6, 7, 8, 9}};
        print2DArray(arr2D);
    }


    public static void print2DArray(int arr2D[][]){
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------- FOR EACH LOOP ----------------");
        for (int[] eachArr : arr2D) {
            for (int element : eachArr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
