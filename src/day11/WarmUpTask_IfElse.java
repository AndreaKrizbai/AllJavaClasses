package day11;

import java.util.Scanner;

public class WarmUpTask_IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String targetOption = scan.next();

        if (targetOption.equals ("Bd")) {
            System.out.println("You have turned the bedroom light on");
        } else if (targetOption.equals ("Lr")) {
            System.out.println("You have turned the living room light on");
        } else if (targetOption.equals ("Ki")) {
            System.out.println("You have turned the kitchen light on");
        } else if (targetOption.equals ("Ha")) {
            System.out.println("You have turned the hallway light on");
        } else {
            System.out.println("There is no such room");
        }
    }
}
