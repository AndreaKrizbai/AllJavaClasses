package day18;

public class DoWhileIntro {
    public static void main(String[] args) {

        int x = 1;

        do {
            System.out.println(x++);
            /*System.out.println(x);
            ++x;
             */
        } while (x <= 5);

        System.out.println("------------------------");

        int y = 5;
        do {
            System.out.println(y);
            --y;
        } while (y > 0);


    }
}
