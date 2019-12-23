package day15;

public class ReversingAString {
    public static void main(String[] args) {

        String name = "Andrea";

        System.out.println(name.charAt(0) + " " + name.charAt(1) +
                " " + name.charAt(2) + " " + name.charAt(3) + " " +
                name.charAt(4) + " " + name.charAt(5));

        System.out.println(name.charAt(5) + " " + name.charAt(4) +
                " " + name.charAt(3) + " " + name.charAt(2) + " " +
                name.charAt(1) + " " + name.charAt(0));

        int characterCount = name.length();
        int lastCharIndex = characterCount -1;
        char lastChar = name.charAt(lastCharIndex);
    }
}
