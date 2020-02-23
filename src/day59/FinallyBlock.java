package day59;

public class FinallyBlock {
    public static void main(String[] args) {
        int[] nums = {1,4,6};

        try {
            System.out.println("nums[100] = " + nums[100]);
            //this is exactly what happens when above code get executed
           // throw new ArrayIndexOutOfBoundsException("Index 100 out of bound for length 3");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This code will always run, no matter that we have exception or not");
        }
        System.out.println("THE END");
    }
}
