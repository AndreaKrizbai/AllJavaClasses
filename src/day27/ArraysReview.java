package day27;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysReview {
    public static void main(String[] args) {
        int num = 10;
        int[] arr = {10,20,30,40,50,60};

        int num1 = arr[arr.length-1];
        System.out.println(num1);
        System.out.println("============================");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n============================");

        String str = Arrays.toString(arr);
        System.out.println(str);

        System.out.println("============================");
        int[] numbers = new int [3];
        System.out.println(Arrays.toString(numbers));

        System.out.println("============================");
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter a number: ");
            numbers[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        // maximum number:
        Arrays.sort(numbers);
        System.out.println("Largest number is : " + numbers[numbers.length-1]);
        // minimum number:
        System.out.println("Lowest number is : " + numbers[0]);

    }
}
