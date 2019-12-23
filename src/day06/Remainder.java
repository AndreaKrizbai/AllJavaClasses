package day06;

public class Remainder {
    public static void main(String[] args) {
        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5/2f);

        System.out.println(5 % 2);
        System.out.println(99 % 10);
        System.out.println(100 % 10);

        int minutes = 135;
        int hourPart = 135/60;
        int minsPart = 135%60;
        System.out.println("The minutes " + minutes + " is " + hourPart +
                "hours and " + minsPart + "minutes");

    }
}
