package day20;

public class WarmUp_SumOfOddAndEven {
    public static void main(String[] args) {

        int sumOdd = 0;
        int sumEven = 0;
 //       int count = 0;

        for (int i = 10; i <= 100; i++) {
            if(i%2==1){
               sumOdd= sumOdd+i;
 //              count++;
 //               System.out.print(i + " ");
            } else {
               sumEven = sumEven+i;
            }
        }
        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Sum of even numbers: " + sumEven);

    }
}
