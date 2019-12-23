package day19;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class SpeedingAndSlowingDown {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter starting speed and ending speed");
        int start = scan.nextInt();
        int end = scan.nextInt();

       if(start<end) {
           System.out.print("INCREASING SPEED: ");
           for (int i = start; i <= end; i++) {
               System.out.print(i + ", ");
           }
       } else if(start>end){
           System.out.print("DECREASING SPEED: ");
           for(int i = start; i>=end; i--){
               System.out.print(i + ", ");
           }
       } else {
           System.out.println("No action needed - same speed!!!");
       }

    }
}
