package day11;

public class StringEquality {
    public static void main(String[] args) {

        String name = "Andrea";
        String name2 = new String ("Andrea");
        String name3 = "Andrea";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println("Using == method");
        System.out.println(name == name2);
        System.out.println(name == name3);
        System.out.println("Using equals method");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));

    }
}
