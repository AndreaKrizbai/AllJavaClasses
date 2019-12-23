package day12;

import java.util.Scanner;

public class SeasonChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your season here:");
        String season = scan.next();

        if (season.equalsIgnoreCase("Fall")){
            System.out.println("BBQ, riding bike, just code, Halloween");
        } else if(season.equalsIgnoreCase("Winter")){
            System.out.println("Code, ski, sledding, snowman");
        } else if(season.equalsIgnoreCase("Spring")){
            System.out.println("Hiking, Navruz, cool weather");
        } else if(season.equalsIgnoreCase("Summer")){
            System.out.println("Pool, swimming, beach, vacation");
        } else {
            System.out.println("Learn your seasons!");
        }





    }
}
