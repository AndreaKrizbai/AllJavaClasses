package day15;

public class StringCaseInsensitiveCheck {
    public static void main(String[] args) {

        String name = "Arya Stark";

        System.out.println("name contains \"st\" or not? " + name.contains("st"));

        String uppercaseName = name.toUpperCase();
        System.out.println("Uppercase name contains ST or not? " + uppercaseName.contains("ST"));

        String lowercaseName = name.toLowerCase();
        System.out.println("Lowercase name contains st or not? " + lowercaseName.contains("st"));

        System.out.println(name.toUpperCase().contains("ST"));
        System.out.println(name.toLowerCase().contains("st"));
    }
}
