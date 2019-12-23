package day18;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("KNOCK KNOCK");
        System.out.println("What's the password?");
        String password = scan.next();

        while (!password.equals("B15")){
            System.out.println("Wrong password - try again:");
            password = scan.next();
        }
        System.out.println("Open sesame");





    }
}
