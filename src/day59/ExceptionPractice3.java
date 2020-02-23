package day59;

import javax.imageio.stream.ImageInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice3 {
    public static void main(String[] args) {

        System.out.println("The start");
        String name = "Furkan";
        Scanner scan = new Scanner(System.in);
        int exit = 0;
        while (exit == 0) {
            System.out.println("Enter index:");
            try {
                int index = scan.nextInt();
                ++exit;
                System.out.println(name.charAt(index));
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input!! Please Enter number.");
                exit = 0;
                scan.nextLine();
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("ERROR!!!!!");
                System.out.println(e.getMessage());
                exit = 0;
            }
        }
        System.out.println("The End!!!");
    }
}
