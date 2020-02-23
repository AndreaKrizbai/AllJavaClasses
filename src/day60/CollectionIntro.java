package day60;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionIntro {
    public static void main(String[] args) {

        Collection<String> names = new ArrayList<>();
        names.add("Hasan");
        names.add("Sevim");
        names.add("Abdullo");
        names.add("Tuana");
        names.add("Daria");
        names.add("Lorin");
        names.addAll(names);

       // names.remove("Hasan");
        names.removeAll(Arrays.asList("Hasan"));
        System.out.println("names = " + names);

        Collection<String>toRemove = Arrays.asList("Abdullo");
        names.removeAll(toRemove);

        System.out.println("names = " + names);
        System.out.println(toRemove);

    }
}
