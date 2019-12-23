package day08;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Guess my favorite number");
        int myFavoriteNumber = scan.nextInt();

        if (myFavoriteNumber == 300){
            System.out.println("BINGO!!");
        } else {
            System.out.println("Try again later");

        }
    }
}
