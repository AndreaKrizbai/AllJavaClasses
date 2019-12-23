package day10;

import java.util.Scanner;

public class SeasonAction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What season is now?");

        String season = scan.next();
        switch(season){

            case "Spring":
                System.out.println("You will hike, Easter, Nawruz, blossom, fall in love");
                break;
            case "Summer":
                System.out.println("You will swim, vacation, BBQ, holiday");
                break;
            case "Fall":
                System.out.println("You will Black Friday, hiking, harvest, Halloween, shopping");
                break;
            case "Winter":
                System.out.println("You will snowboard, ski, Christmas, New Year");
                break;
            default:
                System.out.println("You are no fun!");
                break;
        }
    }
}
