package day57;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Hello B15 OnCampus Friends!");
       // int num = 2.5; - compile error
        int[]nums = new int[3]; //index 0,1,2
        nums[0]=55;
        nums[1]=56;
        nums[2]=100;
      //  nums[10]=200; //ArrayIndexOutOfBoundsException is thrown here

       // System.out.println("Bye Bye B15 OnCampus Friends!");

        int result = 10/0; //ArithmeticException is thrown here
        System.out.println("result = " + result);

    }

}
