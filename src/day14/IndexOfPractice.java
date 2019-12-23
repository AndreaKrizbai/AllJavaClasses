package day14;

public class IndexOfPractice {
    public static void main(String[] args) {

        String name = "Game of Java";

        System.out.println("Find out the location of Java:");
        System.out.println(name.indexOf("Java"));

        System.out.println("Find out the location of o:");
        System.out.println(name.indexOf('o'));

        System.out.println("Find out the location of uppercase O:");
        System.out.println(name.indexOf("O"));

        System.out.println("Find out the location of first space:");
        System.out.println(name.indexOf(" "));

    }
}
