package day31;

import java.util.Scanner;

public class MethodPractice2 {

    //write a piece of reusable code to count from 1 to 10
    //give a name count1to10                             : method name
    //no need for object when being called               : static
    //should be accessible anywhere in your project      : public
    //it does not return any value                       : void
    // does not need any external date when being called : (nothing inside)

    public static void count1to10(){
        for (int i = 1; i <=10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       count1to10();
       count1to10();
       MethodPractice2.count1to10();
        countdownFrom20();
        System.out.println("\n-------------");
        spellYourName();
        System.out.println("\n-------------");
        printOddNumbers1to100();
    }

    public static void countdownFrom20(){
        for (int i = 20; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void spellYourName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        for (int i = 0; i < name.length()-1; i++) {
            System.out.print(name.charAt(i) + "-");
        }
        System.out.print(name.charAt(name.length()-1));
    }

    public static void printOddNumbers1to100(){
        for (int i = 1; i <= 100; i++) {
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
    }

}
