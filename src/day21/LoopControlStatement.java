package day21;

public class LoopControlStatement {
    public static void main(String[] args) {
  /*      for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
            break;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if(i==5){
                break;
            }
        }

   */
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum = sum + i;
            count++;
            if(sum+i>40){
                System.out.println("final sum is " + sum);
                break;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println(count);
    }

}
