package day11;

public class LogicalNotOperator {
    public static void main(String[] args) {

        System.out.println(true);
        System.out.println(false);
        System.out.println(!true);
        System.out.println(!false);

boolean isRecording = false;
        System.out.println("Result of ! isRecording: " + !isRecording);

        System.out.println(7>5);

        int x = 7;
        System.out.println(x > 10);
        System.out.println("result of !(x>10) is " + !(x>10));

        System.out.println(5<10 || 6/3==3 && 8/2<10);
    }
}
