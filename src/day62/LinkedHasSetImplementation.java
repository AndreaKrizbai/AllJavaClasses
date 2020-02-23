package day62;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasSetImplementation {
    public static void main(String[] args) {
        Set<Integer> myNums = new LinkedHashSet<>();
        myNums.add(10);
        myNums.add(10);
        myNums.add(22);
        myNums.add(13);
        myNums.add(13);
        myNums.add(30);
        myNums.add(30);
        System.out.println("myNums = " + myNums);

        Set<Integer> myNums2 = new HashSet<>();
        myNums2.add(10);
        myNums2.add(10);
        myNums2.add(22);
        myNums2.add(13);
        myNums2.add(13);
        myNums2.add(30);
        myNums2.add(30);
        System.out.println("myNums2 = " + myNums2);

    }
}
