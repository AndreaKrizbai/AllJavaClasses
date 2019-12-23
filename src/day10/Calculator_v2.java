package day10;

import java.util.Scanner;

public class Calculator_v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two numbers please:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Choose an operator (your options: +, -, *, /):");
        char operator = scan.next().charAt(0);

        switch(operator){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operator");
        }


    }
}
