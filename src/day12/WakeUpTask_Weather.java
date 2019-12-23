package day12;

import java.util.Scanner;

public class WakeUpTask_Weather {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What the weather like today?");
        String weatherToday = scan.next();

        if (weatherToday.equals("Sunny")){
            System.out.println("Code in Sunny weather!");
        } else if (weatherToday.equals("Rainy")){
            System.out.println("Code in Rainy weather!");
        } else if (weatherToday.equals("Cloudy")){
            System.out.println("Code in Cloudy weather!");
        } else if (weatherToday.equals("Snowy")){
            System.out.println("Code in Snowy weather!");
        } else {
            System.out.println("Rain or shine, just keep coding anyway!");
        }
 //       if ( weatherToday.equals("Sunny") || weatherToday.equals("Rainy") || weatherToday.equals("Cloudy") || weatherToday.equals("Snowy"))
 //       {        System.out.println("Code in " + weatherToday + " weather");}
    }
}
