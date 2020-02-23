package day63;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Grocery {
    public static void main(String[] args) {
        Map<String, Double> groceries = new HashMap<>();
        groceries.put("potatoes",3.99);
        groceries.put("banana",0.49);
        groceries.put("apples",4.99);
        groceries.put("eggs",4.99);
        groceries.put("almond milk",3.99);
        groceries.put("spinach",4.49);
        groceries.put("eggs",4.29);
        groceries.putIfAbsent("eggs",3.69);
        groceries.putIfAbsent("raspberries",4.49);


        System.out.println(groceries.size());

        System.out.println("groceries = " + groceries);

        System.out.println(groceries.get("apples"));

        groceries.replace("potatoes",groceries.get("potatoes")*2);
        groceries.replace("raspberries",groceries.get("raspberries")*2);
        System.out.println("groceries = " + groceries);

        if(groceries.containsKey("eggs")) {
            groceries.remove("eggs");
            System.out.println("no more eggs");
        }
        System.out.println("groceries = " + groceries);

    }
}
