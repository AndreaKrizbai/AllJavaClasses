package day64;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapContinue {
    public static void main(String[] args) {
        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);

        Set<String> allNames = groceryPriceMap.keySet();
//        System.out.println("allNames = " + allNames);
//        allNames.remove("Tomato");
//        System.out.println("allNames no tomato = " + allNames);
//
//        System.out.println("groceryPriceMap after = " + groceryPriceMap);
      //  Set<String>namesCopy = new HashSet<>(allNames);
        Set<String> namesCopy = new HashSet<>(groceryPriceMap.keySet());
        namesCopy.remove("Tomato");
        System.out.println("namesCopy = " + namesCopy);
        System.out.println("groceryPriceMap = " + groceryPriceMap);

    }
}
