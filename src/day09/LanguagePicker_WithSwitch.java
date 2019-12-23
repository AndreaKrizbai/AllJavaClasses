package day09;

import java.util.Scanner;

public class LanguagePicker_WithSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String greeting = "";

        System.out.println("What language would you like to be greeted on? \n" +
                "1 - English \n 2 - Arabic \n 3 - Spanish \n 4 - Russian \n" +
                "5 - Turkish \n 6 - Hungarian \n 7 - French \n " +
                "Please enter a number:");

        int languageOption = scan.nextInt();

        switch (languageOption) {
            case 1:
                greeting = "Hello";
                break;
            case 2:
                greeting = "Salam";
                break;
            case 3:
                greeting = "Hola";
                break;
            case 4:
                greeting = "Privet";
                break;
            case 5:
                greeting = "Merhaba";
                break;
            case 6:
                greeting = "Szia";
                break;
            case 7:
                greeting = "Bonjour";
                break;
            default:
                greeting = "Invalid";
        }
        System.out.println(greeting + ", SDET");
    }
}
