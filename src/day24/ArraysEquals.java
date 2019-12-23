package day24;

import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {
         int [] scores1 = {2, 5, 6, 7, 3, 34, 6};
         int [] scores2 = {22,45,6,37,3,6,9};
         int [] scores3 = {2, 5, 6, 7, 3, 34, 6};
         int [] scores4 = {2, 6, 5, 3, 7, 34, 6};

        System.out.println(scores1==scores2);
        System.out.println(scores1==scores3);

        boolean isS1S2Equals = Arrays.equals(scores1,scores3);
        System.out.println("Is Scores1 has some content as Scores3 = " + isS1S2Equals);
  // same as above, just in one line:      System.out.println(Arrays.equals(scores1,scores3));
        System.out.println("Is S3=S4? " + Arrays.equals(scores3,scores4));

        Arrays.sort(scores3);
        Arrays.sort(scores4);
        System.out.println("After sorting, is S3=S4? " + Arrays.equals(scores3,scores4));

    }
}
