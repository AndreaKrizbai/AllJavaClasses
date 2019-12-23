package day11;

import java.util.Scanner;

public class ScoreChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your score: ");
        int score = scan.nextInt();

        if (score < 0 || score > 100){
            System.out.println("INVALID SCORE!!!");
        } else if(score == 100){
            System.out.println("PERFECT SCORE <3");
        } else if (score >= 70 && score < 100){
            System.out.println("You have passed!");
        } else if(score >= 40 && score < 70){
            System.out.println("Little bit more study will let you pass");
        } else if (score >= 30 && score < 40){
            System.out.println("Attend additional classes");
        } else if(score < 30){
            System.out.println("Come to my office");
        }
    }
}
