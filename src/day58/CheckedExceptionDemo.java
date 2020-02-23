package day58;

public class CheckedExceptionDemo {
    public static void main(String[] args){ //throws InterruptedException {
        System.out.println("Checked Exception in next line");
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Exception was caught");
        }
        System.out.println("After Thread.sleep");
    }
}
