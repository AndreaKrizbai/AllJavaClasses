package day32;

public class Practice {
    public static void main(String[] args) {
        printAtoZ();
        numberAddition(12,13);
        numberComparison(12,13);
        stringRepeater("I love Java", 5);
        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0();
        print1toX(25);
    }

    public static void printAtoZ(){
        for (char a = 'A'; a <= 'Z'; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void numberComparison(int num1, int num2){
        if(num1 > num2){
            System.out.println(num1 + " is larger than " + num2);
        } else if(num2 > num1){
            System.out.println(num2 + " is larger than " + num1);
        } else {
            System.out.println(num1 + " equals to " + num2);
        }
    }

    public static void numberAddition(int num1, int num2){
        System.out.println(num1+num2);
    }

    public static void stringRepeater (String strToRepeat, int count){
        for (int i = 0; i < count ; i++) {
            System.out.print(strToRepeat + " ");
        }
        System.out.println();
    }

    public static void skipCountBy3From0to50 (){
        for (int i = 0; i <= 50; i++) {
            if(i%3==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void countDownByEvenNumberFrom50to0(){
        for (int i = 50; i >= 0 ; i--) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void print1toX(int x){
        for (int i = 1; i <= x; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
