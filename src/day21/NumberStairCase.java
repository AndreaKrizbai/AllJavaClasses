package day21;

public class NumberStairCase {
    public static void main(String[] args) {

        for (int x = 1; x <= 5; x++) {
            for (int z = 5; z >= x; z--) {
                System.out.print(z + " ");
            }
            System.out.println();
        }
       for (int i = 1; i <= 5; i++) {
                for (int y = 1; y <= i; y++) {
                    System.out.print(y + " ");
                }
                System.out.println();
            }
       }




  /*      int lineCount = 30;
        int maxLineNum = (lineCount + 1) / 2;
        for (int i = 1; i <= maxLineNum; i++) {
            for (int space = 1; space <= maxLineNum - i; space++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= (i * 2) - 1; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }



   */

}
