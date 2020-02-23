package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        for (int number = 1; number <= 100; number++) {
           nums.add(number);
        }
        System.out.println(nums);

        //change all the odd number value to 0;
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i)%2==1){
                nums.set(i,0);
            }
        }
        System.out.println(nums);

        for (int i = 0; i < nums.size(); i+=2) {
          //  System.out.println("Odd values are at index = " + i);
            nums.set(i,0);
        }
        System.out.println(nums);

        //how to find index of value 20
        System.out.println("index of 20 : " + nums.indexOf(20));

        //insert 100 to first index
        nums.add(0,100);
        System.out.println(nums);
        System.out.println("index of 20 : " + nums.indexOf(20));



    }
}
