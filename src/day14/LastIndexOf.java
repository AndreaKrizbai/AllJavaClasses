package day14;

public class LastIndexOf {
    public static void main(String[] args) {

        String name = "Game of Java";
        System.out.println("Find out last location the character a shows up");
        System.out.println(name.lastIndexOf("a"));
        System.out.println("Find out last location the character space shows up");
        System.out.println(name.lastIndexOf(" "));
        System.out.println("Find out last location the letters Ga show up");
        System.out.println(name.lastIndexOf("Ga"));
        System.out.println("Find out last location the letters Kawa up");
        System.out.println(name.lastIndexOf("Kawa"));

// if I don't use contains method, what would be my condition to check
        // whether we have Kawa in this String, either using indexOf or lastIndexOf
if (name.indexOf("Kawa") > -1){
    System.out.println("Kawa found");
} else {
    System.out.println("No Kawa - no pumpkin");
}
    }
}
