package day28;

import java.util.Arrays;

public class ExcelVisualizer2 {
    public static void main(String[] args) {


        int[][] myExcel = {     {10,27,88,99}, //first 1D array - index 0
                                {87,100},
                                {90,45,65}       };


        System.out.println(Arrays.deepToString(myExcel));

        for(int[] eachRow : myExcel){
            for( int eachCell : eachRow){
                System.out.print(eachCell + " ");
            }
            System.out.println();
        }

        int[][] myExcel2 = { {78,54,100,84},{33,44,77,123},{12,88,52,76},{67,33,98,67},{12,88,52,45},{67,33,98,34} };
        for (int i = 0; i < myExcel2.length; i++) {
            for (int j = 0; j < myExcel2[i].length; j++) {
                System.out.print("Cell(" + (i+1) + "," + (j+1) + ")= " + myExcel2[i][j] + "   ");
            }
            System.out.println();
        }


    }
}
