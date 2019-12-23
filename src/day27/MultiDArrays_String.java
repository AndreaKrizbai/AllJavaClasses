package day27;

import java.util.Arrays;

public class MultiDArrays_String {
    public static void main(String[] args) {

        String[][] names = {{"Rukhshona", "Ghoya"}, {"Hasan", "Tetiana"}};
        System.out.println(names[1][0]);

        names[1][1] = "Dilshat";
        System.out.println(names[1][1]);

        System.out.println(Arrays.toString(names[1]));

        System.out.println(Arrays.deepToString(names));

        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12, 13}};

        for (int i = 0; i < numbers.length; i++) { //checks each index of two dimensional array
            System.out.println(Arrays.toString(numbers[i]));
            for (int j = 0; j < numbers[i].length; j++) { //checks each element of single dimensional arrays
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("====================================");
        int[][] ages = {{10}, {12, 13, 14, 16, 17}, {19, 20, 21, 22, 23}};
        System.out.print("Even numbers: ");
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
                if (ages[i][j] % 2 == 0) {
                    System.out.print(ages[i][j] + " ");
                }
//                if (ages[i][j] % 2 != 0) {
//                    continue;
//                }
//                    System.out.print(ages[i][j] + " ");
//            }

            }
        }
        System.out.println("\n====================================");
        int[]arr1D = {1,2,3};
        for (int each : arr1D){
            System.out.print(each + " ");
        }

        System.out.println("\n====================================");
        int [][] arr2D = {{10,20,30},{40,50,60,70,80,90,100}};
        for (int[] each1DArray : arr2D) {
            for (int eachElement : each1DArray) {
                System.out.print(eachElement + " ");
            }
        }

    }
}