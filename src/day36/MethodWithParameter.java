package day36;

public class MethodWithParameter {
    public static void main(String[] args) {

        addOneHundred(25);
        int num = 7;
        addOneHundred(num);
        addHundred(25);

        int num2 = 10;
        addHundred(num2);
        System.out.println(num2);

        num = addOneHundredAndReturn(num);
        System.out.println(num);

    }

    public static void addHundred (int x){
        x = x+100;
        System.out.println(x);
    }

    public static void addOneHundred(int x){
        System.out.println(x + 100);
    }
    public static int addOneHundredAndReturn(int x) {
        x = x + 100;
        //System.out.println( x );
        return x;
    }




}
