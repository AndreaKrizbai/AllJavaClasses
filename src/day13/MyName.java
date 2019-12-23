package day13;

public class MyName {
    public static void main(String[] args) {

        String myName = "Andrea Krizbai";
        System.out.println(myName);
        myName = "Andocs";
        System.out.println(myName);
        System.out.println("MY NAME IS " + myName.toUpperCase());
        System.out.println("my name is " + myName.toLowerCase());
        System.out.println(myName.length());
        System.out.println(myName.startsWith("An"));
        System.out.println(myName.endsWith("drea"));
        System.out.println(myName.endsWith("docs"));
    }
}
