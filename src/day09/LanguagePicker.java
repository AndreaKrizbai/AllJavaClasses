package day09;

import java.util.Scanner;

public class LanguagePicker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String greeting = "";

        System.out.println("What language would you like to be greeted on? \n" +
                "1 - English \n 2 - Arabic \n 3 - Spanish \n 4 - Russian \n" +
                "5 - Turkish \n 6 - Hungarian \n 7 - French \n " +
                "Please enter a number:");

        int languageOption = scan.nextInt();

        if (languageOption == 1) {
            greeting = "Hello";
        } else if (languageOption == 2) {
            greeting = "Salam";
        } else if (languageOption == 3) {
            greeting = "Hola";
        } else if (languageOption == 4) {
            greeting = "Privet";
        } else if (languageOption == 5) {
            greeting = "Merhaba";
        } else if (languageOption == 6) {
            greeting = "Szia";
        } else if (languageOption == 7) {
            greeting = "Bonjour";
        } else {
            greeting = "Invalid";
        }
        System.out.println(greeting + ", SDET");
    }
}
