package day22;

public class MultiplicationTable {
    public static void main(String[] args) {

        for (int column = 1; column <= 10; column++) {
            System.out.println();
                for (int row = 1; row <= 10 ; row++) {
                System.out.print(row + " x " + column + " = " + row * column + "\t");
            }
        }
    }
}
