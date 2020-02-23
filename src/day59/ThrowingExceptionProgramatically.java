package day59;

public class ThrowingExceptionProgramatically {
    public static void main(String[] args) throws Exception {
       // NullPointerException e1 = new NullPointerException();

        NullPointerException e2 = new NullPointerException("Back to earth");
        System.out.println(e2.getMessage());

      //  throw new NullPointerException("Back to earth");
        throw e2;


    }
}
