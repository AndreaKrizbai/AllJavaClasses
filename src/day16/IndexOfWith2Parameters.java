package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {

        String name = "I love Java I Love Java Java Java";

        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("Java", 8));
        System.out.println(name.indexOf("Java", 20));
        System.out.println(name.lastIndexOf("Java", 28));

        System.out.println(name.indexOf("Java", name.indexOf("Java")+1));

        int firstJavaLocation = name.indexOf("Java");
        int startingPointToSearchSecondJava = firstJavaLocation + 1;
        int secondJavaLocation = name.indexOf("Java", startingPointToSearchSecondJava);
        System.out.println("secondJavaLocation = " + secondJavaLocation);

        int firstSpaceLocation = name.indexOf(" ");
        int secondSpace = name.indexOf(" ", firstSpaceLocation +1);

        System.out.println("Second word in this sentence is " + name.substring(firstSpaceLocation
         + 1, secondSpace));

    }
}
