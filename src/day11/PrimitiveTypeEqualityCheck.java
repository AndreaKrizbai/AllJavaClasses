package day11;

public class PrimitiveTypeEqualityCheck {
    public static void main(String[] args) {

        char c1 = 'b';
        char c2 = 'B';
        char c3 = 'b';

        System.out.println("Is c1 equal to c2? " + (c1 == c2));
        System.out.println("Is c1 equal to c3? " + (c1 == c3));

        int num1 = 10;
        int num2 = 10;
        System.out.println("Is num1 equal to num2? " + (num1 == num2));
    }
}
