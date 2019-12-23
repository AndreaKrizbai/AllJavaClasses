package day17;

public class SkipCounting {
    public static void main(String[] args) {

        int counter = 0;
        while (counter < 30) {
            counter = counter + 3;
            //           counter += 3;
            System.out.print(counter + " ");
        }

        System.out.println();

        int counterEven = 0;
        while (counterEven <= 50) {
            System.out.print(counterEven + " ");
            counterEven = counterEven + 2;
        }

        System.out.println();

        int counterOdd = 1;
        while (counterOdd <= 50) {
            System.out.print(counterOdd + " ");
            counterOdd += 2;
        }

        System.out.println();

        int cnt3 = 0;
        while (cnt3 <= 50) {
           if (cnt3 % 2 == 0) {
               System.out.println(cnt3 + " is even number");
           } else {
               System.out.println(cnt3 + " is odd number");
           }
           ++cnt3;
       }

    }
}