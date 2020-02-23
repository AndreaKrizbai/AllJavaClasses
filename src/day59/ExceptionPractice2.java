package day59;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice2 {
    public static void main(String[] args) {

        System.out.println("The Start");
        String name = "Furkan";

        Scanner scan = new Scanner(System.in);
        int exit = 0;
        while (exit==0) {
            System.out.println("Enter index: ");
            try {
                ++exit;
                int targetIndex = scan.nextInt();
                System.out.println(name.charAt(targetIndex));

                System.out.println("end of try");
                //} catch (Exception e){
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("You are out of bound!!!!!");
                System.out.println("Enter between 0 and " + (name.length() - 1));
                exit = 0;
            } catch (InputMismatchException e) {
                System.out.println("Input mismatch, enter number!!!!!");
                System.out.println("Here is what you get if you enter 0: " + name.charAt(0));
                scan.nextLine();
                exit = 0;
            }
        }
        System.out.println("The End");


    }
}
