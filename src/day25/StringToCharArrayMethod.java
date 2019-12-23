package day25;

import java.util.Arrays;

public class StringToCharArrayMethod {
    public static void main(String[] args) {

        String name = "Andrea";
        char [] nameChars = new char[name.length()];

        for (int i = 0; i < nameChars.length; i++) {
            nameChars[i] = name.charAt(i);
        }
        System.out.println("name's characters: " + Arrays.toString(nameChars));

        char[] allChars = name.toCharArray();
        System.out.println("allChars = " + Arrays.toString(allChars));


    }
}
