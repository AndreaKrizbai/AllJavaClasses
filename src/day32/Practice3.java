package day32;

public class Practice3 {
    public static void main(String[] args) {
        System.out.println(doubleTheNumber(25));
        System.out.println(add2Numbers(12,13));
        System.out.println(divideNumbers(25,3));
        System.out.println(voterOrNot(25));
    }

    public static int doubleTheNumber(int num){
        return num*2;
    }

    public static int add2Numbers(int num1, int num2){
        return num1+num2;
    }

    public static double divideNumbers(double num1, double num2){
        if(num2==0){
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public static boolean voterOrNot (int age){
        return age>=18;
    }
}
