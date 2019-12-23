package day12;

import java.util.Scanner;

public class FizzBuzzNumberCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int FizzBuzz = scan.nextInt();

        if(FizzBuzz % 5 == 0 && FizzBuzz % 3 == 0){
            System.out.println("It's a FizzBuzz Number");
        } else if (FizzBuzz % 5 == 0){
            System.out.println("It's a Fizz Number");
        } else if (FizzBuzz % 3 == 0){
            System.out.println("It's a Buzz Number");
        } else {
            System.out.println("Not my number");
        }
    }
}
