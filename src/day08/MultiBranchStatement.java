package day08;

import java.util.Scanner;

public class MultiBranchStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your current speed, dear?");
        int currentSpeed = scan.nextInt();

        if(currentSpeed>90){
            System.out.println("Waaaaay too much, dear -- JAIL");
        } else if(currentSpeed>80){
            System.out.println("That's a lot -- RECKLESS DRIVING");
        } else if(currentSpeed > 70){
            System.out.println("Slow down -- POINTS TAKEN");
        } else if(currentSpeed > 60){
            System.out.println("It's your lucky day -- WARNING");
        } else if(currentSpeed < 40){
            System.out.println("Dude, you need to speed up, seriously!");
        } else {
            System.out.println("Keep driving, you are good!");
        }
    }
}
