package day60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10,4,5,22,88,13));
        System.out.println("nums = " + nums);
//        for (int i = 0; i < nums.size(); i++) {
//            if(((ArrayList<Integer>) nums).get(i)>10){
//                nums.remove(((ArrayList<Integer>) nums).get(i));
//            }
//        }
//        System.out.println("nums = " + nums);

        Iterator<Integer> myIter = nums.iterator();
        while(myIter.hasNext()){
            if(myIter.next()<=10){
                myIter.remove();
            }
        }
//        System.out.println("myIter.hasNext() = " + myIter.hasNext());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        myIter.remove();
//        System.out.println("myIter.next() = " + myIter.next());
//
//        System.out.println("myIter.hasNext() = " + myIter.hasNext());
        System.out.println("nums = " + nums);


    }
}
