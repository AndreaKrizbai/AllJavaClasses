package day18;

import java.util.Arrays;

public class EvenNumber_ForLoop {
    public static void main(String[] args) {

        for(int i=0; i<=100; i+=2){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int x = 0; x <= 100; x= x+3){
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println("----even number----");

        for (int i = 0; i <= 100; i++) {
            if( i%2 == 0){
                System.out.print(i + " ");
            }
        }

        for (int i = 0; i < 100; i++) {
           if(i%5==0 && i%3==0){
               System.out.println(i + " is a fizz buzz number");
           }
        }
    }
}
