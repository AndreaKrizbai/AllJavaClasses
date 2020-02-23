package day62;

import java.util.*;

public class SetInterface2 {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(10, 10,20,20, 20,30,30,30,30);
        System.out.println("numList = " + numList);

        Set<Integer> myNums = new HashSet<>(numList);
        System.out.println("myNums = " + myNums);

        Set<String>states = new HashSet<>();
        states.addAll(Arrays.asList("Florida","Virginia", "Hawaii","Maryland","Colorado", "Utah","Michigan",
                "Texas","California","Georgia","Illinois","Hawaii","Hawaii","California","Florida"));

        System.out.println(states.size());

        for (String each : states) {
            System.out.println(each);
        }

        System.out.println("-------------------------------------------");

        Iterator<String> itr = states.iterator();
//            while (itr.hasNext()) {
////                System.out.println(itr.next());
////            }
       states.forEach(each -> System.out.println(each));

       for(String each : states){
           System.out.println(each);
       }



        }
}
