package Practice;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 0;
        for (int b = 0; b < 10; b++) {
            num++;
            for (int i = 1; i < 11; i++) {
                System.out.println(num + " * " + i + " = " + num * i);

            }
        }

        for (int x = 1; x <= 12; x++) {
            for (int y = 1; y <= 12; y++) {
                System.out.println(x + "*" + y + "=" + y * x);
            }
            System.out.println();
        }
    }
}
