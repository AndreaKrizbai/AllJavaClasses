package day51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparing {

    public static void main(String[] args) {
        Person p1 = new Person("Arafat", 34);
        Person p2 = new Person("Zhibekchach", 18);
        Person p3 = new Person("Asena", 18);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);

//        if(p1.age>p2.age){
//            System.out.println(1);
//        } else if(p1.age==p2.age){
//            System.out.println(0);
//        } else {
//            System.out.println(-1);
//        }

        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p3));

        System.out.println(p3.compareTo(new Person("Jon Snow",27)));
        // same below, just in two lines
        int result = p3.compareTo(new Person("Jon Snow",27));
        System.out.println("result = " + result);

        //print out the name of younger person between p1 and p3
        if(p1.compareTo(p3)==1){
            System.out.println(p3.name);
        }else{
            System.out.println(p1.name);
        }

        List<Person> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(new Person("Jon Snow", 27));
        System.out.println("lst =" + lst);

       Collections.sort(lst);
        System.out.println("lst = " + lst);

    }


}
