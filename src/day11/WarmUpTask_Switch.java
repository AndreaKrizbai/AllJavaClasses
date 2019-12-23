package day11;

import java.util.Scanner;

public class WarmUpTask_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a room code:");
        String targetOption = scan.next();

        switch (targetOption) {
            case "Bd":
                System.out.println("You have turned the bedroom light on");
                break;
            case "Lr":
                System.out.println("You have turned the living room light on");
                break;
            case "Ki":
                System.out.println("You have turned the kitchen light on");
                break;
            case "Ha":
                System.out.println("You have turned the hallway light on");
                break;
            default:
                System.out.println("There is no such room");
                break;
        }
    }
}
