package day18;

import java.util.Scanner;

public class GiveMe$5$20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please gimme 5 or 20!!");

        int x = scan.nextInt();

        while (!(x==5 || x==20)){
 //       while(x!=5 && x!=20){
            System.out.println("Not the bill I am looking for");
            System.out.println("Please gimme 5 or 20");
            x = scan.nextInt();
        }
        System.out.println("Got the money, thank you!!!");
    }
}
