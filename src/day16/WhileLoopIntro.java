package day16;

public class WhileLoopIntro {
    public static void main(String[] args) {

        int count = 1;
        System.out.println("Hello World");
        ++count;
 //    count = count + 1;
 //    count += 1;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");

        System.out.println("Count is " + count);
        System.out.println("-------------------");

        int cnt = 1;
        while (cnt <= 5){
            System.out.println("Hello");
            System.out.println("cnt value is " + cnt);
            ++cnt;
        }
    }
}
