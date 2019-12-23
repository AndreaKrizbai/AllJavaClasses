package day29;

import java.util.Arrays;

public class Stringpractice {
    public static void main(String[] args) {
        String hero1 = "Superman-Clark J Kent";

        String[] hero1Splitted = hero1.split("-");
        System.out.println("hero1Splitted = " + Arrays.toString(hero1Splitted));

        System.out.println("Hero code is " +hero1Splitted[0] + " and identity is " + hero1Splitted[1]);

        String heroCode = hero1Splitted[0];
        String fullName = hero1Splitted[1];
        System.out.println("Hero code is " + heroCode + " and identity is " + fullName);

        String[]fullNameSplitted = fullName.split(" ");
        System.out.println(Arrays.toString(fullNameSplitted));

        String lastName = fullNameSplitted [fullNameSplitted.length-1];
        System.out.println("lastName = " + lastName);

        System.out.println("Initial of the hero is: " + fullName.charAt(0) + lastName.charAt(0));
        System.out.println("Initial: " + fullNameSplitted[0].charAt(0) + fullNameSplitted[fullNameSplitted.length-1].charAt(0));



    }
}
