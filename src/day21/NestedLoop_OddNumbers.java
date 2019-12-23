package day21;

public class NestedLoop_OddNumbers {
    public static void main(String[] args) {

        for (int x = 1; x <= 4; x++) {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    continue;
                }
                System.out.print(i + " ");
            }
            System.out.println();
        }


 /*       for (int z = 1; z <=4 ; z++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 2 == 1) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

  */
    }
}
