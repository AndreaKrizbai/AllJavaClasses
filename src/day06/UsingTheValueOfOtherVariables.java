package day06;

public class UsingTheValueOfOtherVariables {
    public static void main(String[] args) {

        int myFavoriteNumber = 300;
        int yourFavoriteNumber = myFavoriteNumber;

        System.out.println("My favorite number is " + myFavoriteNumber);
        System.out.println("Your favorite number is " + yourFavoriteNumber);

        yourFavoriteNumber = 100;

        System.out.println("My favorite number is " + myFavoriteNumber);
        System.out.println("Your favorite number is " + yourFavoriteNumber);

    }
}
