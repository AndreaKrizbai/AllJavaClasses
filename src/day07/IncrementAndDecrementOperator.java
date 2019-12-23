package day07;

public class IncrementAndDecrementOperator {
    public static void main(String[] args) {

        int apple = 10;
        System.out.println("Original apple count is: " + apple);

        // apple = apple +1;
        // apple +=1;
        ++ apple;
        ++ apple;
        System.out.println("Used ++ twice then apple count is: " + apple);

       // apple = apple - 1;
        // apple -=1;
        -- apple;

        System.out.println("Used -- once then apple count is: " + apple);

        // System.out.println(++apple);
        System.out.println("Used ++ to increment and concatenate: " + (++apple));
    }
}
