package day21;

public class DecidingWhenToStop {
    public static void main(String[] args) {
        String msg = "Hello World";
        int n =6;

        for (int i = 0; i <= msg.length()-n; i++) {
            System.out.println(msg.substring(i,i+n));
        }
    }
}
