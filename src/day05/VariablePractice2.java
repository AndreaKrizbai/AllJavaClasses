package day05;

public class VariablePractice2 {

    public static void main(String[] args) {

        /* int speedLimit = 65;
        int overTheLimit = 10;
        int currentSpeed = speedLimit + overTheLimit;

        System.out.println("The speed limit is " + speedLimit +
                "mph and you are doing " + currentSpeed + "mph.");
*/
        int speedLimit = 65;
        int currentSpeed = 95;
        int overTheLimit = currentSpeed - speedLimit;

        System.out.println("You are driving " + overTheLimit +
                " mph more than the speed limit.");

        System.out.println("I was driving " + currentSpeed +
                " MPH and the speed limit was " + speedLimit + " MPH, "
        + "that means I was driving " + overTheLimit + " over the limit.");
    }
}
