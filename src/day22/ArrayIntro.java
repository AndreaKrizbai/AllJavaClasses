package day22;

public class ArrayIntro {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println("num1 = " + num1);
        num1 = 25;
        System.out.println("num1 = " + num1);
        // dataType[]variableName = new dataType[count of item];
        int [] scores = new int[4];
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);


 /*       for (int i = 0; i <= 3 ; i++) {
            System.out.println(scores[i]);
        }
  */
        scores[1] = 99;
        System.out.println(scores[1]);

        int[] numbers = new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        byte[] data = new byte[4];
        data[0] = 98;
        data[1] = 75;
        data[2] = 83;
        data[3] = 99;
        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
        data[3] = 100;
        System.out.println(data[3]);
//   byte size -128 to 127



    }
}
