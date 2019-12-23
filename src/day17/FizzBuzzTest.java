package day17;

public class FizzBuzzTest {
    public static void main(String[] args) {

        int num = 1;

        while (num <= 47) {

            if (num % 5 == 0 && num % 3 == 0) {
                System.out.println(num + " is Fizz Buzz Number");
            } else if (num % 5 == 0) {
                System.out.println(num + " is a Fizz Number");
            } else if (num % 3 == 0) {
                System.out.println(num + " is a Buzz Number");
            }
            ++num;
        }
    }
}
