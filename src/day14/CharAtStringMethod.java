package day14;

public class CharAtStringMethod {
    public static void main(String[] args) {

        String name = "Andrea";
        System.out.println(name.charAt(0));
        System.out.println("\t" + name.charAt(1));
        System.out.println("\t\t" + name.charAt(2));
        System.out.println("\t\t\t" + name.charAt(3));
        System.out.println("\t\t\t\t" + name.charAt(4));
        System.out.println("\t\t\t\t\t" + name.charAt(5));
        System.out.println("" + name.charAt(0) + name.charAt(1));

        String aName = "Arya";
        char c1 = aName.charAt(0);
        char c2 = aName.charAt(1);
        char c3 = aName.charAt(2);
        char c4 = aName.charAt(3);
        System.out.println("" + c1 + c2 + c3 + c4);
        // need String in the beginning or anywhere in () to concatenate as String and not as ASCII number
    }
}
