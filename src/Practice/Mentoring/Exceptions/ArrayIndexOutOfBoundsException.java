package Practice.Mentoring.Exceptions;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int [] array = new int[2];
        System.out.println("Hello before exception");
        System.out.println(array[5]);
        System.out.println("Hello after exception");
    }
}
