package day26;

import java.util.Arrays;

public class SwappingValues {
    public static void main(String[] args) {
        String name1 = "Andrea";
        String name2 = "Dreah";

        System.out.println(name1 + " " + name2);
        String temp = name1;
        name1 = name2;
        name2 = temp;
        System.out.println(name1 + " " + name2);

        int [] myNumbers = new int[]{10,40,30,7};
        System.out.println("Original array: " + Arrays.toString(myNumbers));
        int tempNumber = myNumbers[0];
        myNumbers[0] = myNumbers[3];
        myNumbers[3] = tempNumber;
        System.out.println(Arrays.toString(myNumbers));

        int tempNumber2 = myNumbers[1];
        myNumbers[1] = myNumbers[2];
        myNumbers[2] = tempNumber2;
        System.out.println("Reversed string: " + Arrays.toString(myNumbers));

    }
}
