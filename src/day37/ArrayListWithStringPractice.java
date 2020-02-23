package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {
    public static void main(String[] args) {

        List<String> superHeros = new ArrayList<>();
        superHeros.add("Cyborg");
        superHeros.add("Flash");
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Cyborg");
        superHeros.add("Flash");
        superHeros.add("Aquaman");
        superHeros.add("Wonder Woman");

        System.out.println("superHeros = " + superHeros);
        System.out.println("superheros.contains\"Superman\" = " + superHeros.contains("Superman"));
        System.out.println("superheros.contains\"man\" = " + superHeros.contains("man"));

        for (int i = 0; i < superHeros.size() ; i++) {
            String currenthero = superHeros.get(i);
            if(!currenthero.contains("man")){
                superHeros.remove(currenthero);
                i--;
            }
        }
        System.out.println(superHeros);
        List<String>superHeroCopy = new ArrayList<>(superHeros);
        System.out.println("superHeroCopy = " + superHeroCopy);
        List<String>topics = Arrays.asList("Java","Selenium","Database","API");
        System.out.println("topics = " + topics);
        List<String>topicsCopy = new ArrayList<>(topics);
        System.out.println("topicsCopy = " + topicsCopy);
    }

}
