package day09;

import java.util.Scanner;

public class CitizenTypeChecker {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = scan.nextInt();
        String citizenType;

        if(age > 65){
            citizenType = "Senior";
        }else{
            citizenType = "not Senior";
        }
        System.out.println("The citizen's age is " + age + ", he is " + citizenType);
    }
}
