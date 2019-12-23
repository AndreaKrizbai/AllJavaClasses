package day23;

public class WarmUp_Array {
    public static void main(String[] args) {
        int [] numbers = new int [] {1,2,3,4,5,6,7};

        for (int i = numbers.length-1; i >= 0 ; i--) {
            System.out.println(numbers[i]);
        }
        int lastItem = numbers[numbers.length-1];
        System.out.println("lastItem = " + lastItem);

        System.out.println(numbers[numbers.length/2]);

        int sum = 0;
        for (int x = 0; x < numbers.length; x++) {
            sum = sum + numbers[x];
        }
        System.out.println("sum = " + sum);

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max){
                max = numbers[i];
            } else {
                System.out.println("min = " + max);
            }
        }
        System.out.println("max = " + max);
    }
}
