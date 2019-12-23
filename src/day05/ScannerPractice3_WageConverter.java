package day05;

import java.util.Scanner;

public class ScannerPractice3_WageConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What's your hourly rate?");
        double hourlyRate = scan.nextDouble();
        double annualSalary = hourlyRate * 2080;
        System.out.println("Your annual salary is $" + annualSalary);

    }
}
