package day21;

public class OrderOfBreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
 //           break;
            continue;
 //           System.out.println("HELLO");
 //           It will not work, unreachable code
        }
        System.out.println("THE END");
    }
}
