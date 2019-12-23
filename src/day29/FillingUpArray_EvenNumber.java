package day29;

import java.util.Arrays;

public class FillingUpArray_EvenNumber {
    public static void main(String[] args) {
//fill up array with even numbers starting from 0
        int[] numbers = new int[100];

        System.out.println("Before filling up \n" + Arrays.toString(numbers));

//        numbers[0] = 0; // 0*2
//        numbers[1] = 2; // 1*2
//        numbers[2] = 4; // 2*2
//        //...
//        numbers[99] = 198; //99*2

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        System.out.println("After filling up \n" + Arrays.toString(numbers));

//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                numbers[i] = i * 2;
//            }
//        }
//        System.out.println("New" + Arrays.toString(numbers));

        String [] ThreeHundred = new String[300];
        System.out.println(Arrays.toString(ThreeHundred));
        for (int i = 0; i < ThreeHundred.length; i++) {
            ThreeHundred[i] = (i+1) + ") I love Java";
        }
        System.out.println(Arrays.toString(ThreeHundred));

        String hello = new String ("hello szia"); // this is a String object with value hello szia
        String[] helloArr = new String[5]; // empty String array with capacity 5
        System.out.println(hello);
        helloArr[0] = "I love JAVA";
        System.out.println(Arrays.toString(helloArr));

    }
}
