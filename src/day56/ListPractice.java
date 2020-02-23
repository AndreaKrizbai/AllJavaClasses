package day56;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(11);
        nums.add(25);

        System.out.println("nums.contains(10) = " + nums.contains(10));
        System.out.println("nums.indexOf(25) = " + nums.indexOf(25));

    }
}
