package day27;

public class MultiDArrays_3DPractice {
    public static void main(String[] args) {

        int [][][] arr3D = {    { {1,2,3},{4,5,5} }  ,  { {7,8,9},{10,11,12} }   };

        for (int i = 0; i < arr3D.length; i++) {
            for (int j = 0; j < arr3D[i].length; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    System.out.print(arr3D[i][j][k] + " ");
                }
            }
        }
        System.out.println("\n=============================");
        //convert to for each loop, print elements out one by one
        for ( int [][] twoDArrays : arr3D){
            for (int [] oneDArrays : twoDArrays){
                for (int everyElement : oneDArrays){
                    System.out.print(everyElement + " ");
                }
            }
        }




    }
}
