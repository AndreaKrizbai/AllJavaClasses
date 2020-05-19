package Practice.Mentoring.Exceptions;

public class MyException extends Throwable {
   //Customized Exception class
}

class ThrowAndThrowsExample{
    static void method() throws MyException{
        MyException e = new MyException();
        throw e;
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
