package day57;

public class TryCatch {
    public static void main(String[] args) {
        System.out.println("Before try catch");
        try {
            System.out.println("In Try block");
            int result = 10 / 0;
            System.out.println("After 10/0 line");
        } catch(ArithmeticException e){
            System.out.println("Exception happened and was caught");
        }
        System.out.println("After try catch");

        try{
            System.out.println("In second Try block");
            String str = "Java is fun!";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));
        } catch (Exception e) {
       // } catch (Throwable e) {
            System.out.println("Exception happened again in Try Block and caught");
        }

        System.out.println("After second TRY CATCH");


    }
}
