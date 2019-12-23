package day04;

public class ArithmeticOperator {

    public static void main(String[] args) {

        System.out.println( 5 + 3 );
        System.out.println( 5 - 3 );
        System.out.println( 5 * 3 );
        System.out.println( 5 / 3 );

        System.out.println( 5 + 3.0d );
        System.out.println( 5 - 3.0d );
        System.out.println( 5 * 3.0d );
        System.out.println( 5 / 3.0d );
        System.out.println( 5 / 3.0f );

        int a = 5;
        double b = 3.0d;
        float c = 3.0f;

//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a / c);

        double result1 = a + b;
        double result2 = a - b;
        double result3 = a * b;
        double result4 = a / b;
        float result5 = a / c;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }
}
