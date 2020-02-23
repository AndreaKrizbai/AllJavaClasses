package day63;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {
    public static void main(String[] args) {

        Map<String,Integer>nameAgePair = new HashMap<>();
        nameAgePair.put("Zehra",6);
        nameAgePair.put("Muhammed",21);
        nameAgePair.put("Maiia",27);
        nameAgePair.put("Aidar",20);
        nameAgePair.put("Fatih",27);
        nameAgePair.put("Rukhshona",16);
        nameAgePair.put("Aidar",19);
        nameAgePair.putIfAbsent("Aidar",18);

        System.out.println("nameAgePair = " + nameAgePair);
        System.out.println("nameAgePair.size() = " + nameAgePair.size());

        System.out.println("Aidar's age is " + nameAgePair.get("Aidar"));
        System.out.println("Does Rukhksona exist in Map? " + nameAgePair.containsKey("Rukhshona"));
        System.out.println("Does Hasan exist in Map? " + nameAgePair.containsKey("Hasan"));

        nameAgePair.replace("Maiia",17);
        System.out.println("nameAgePair.get(\"Maiia\") = " + nameAgePair.get("Maiia"));
        //change Zehra's age to 9 if it was 17
        nameAgePair.replace("Zehra",17,9);
        System.out.println("nameAgePair.get(\"Zehra\") = " + nameAgePair.get("Zehra"));
        nameAgePair.replace("Zehra",6,9);
        System.out.println("nameAgePair.get(\"Zehra\") = " + nameAgePair.get("Zehra"));
        System.out.println(nameAgePair.get("Z"));

        nameAgePair.remove("Fatih");
        System.out.println("nameAgePair = " + nameAgePair);
        System.out.println("nameAgePair.get(\"Fatih\") = " + nameAgePair.get("Fatih"));
        System.out.println("nameAgePair.containsKey(\"Fatih\") = " + nameAgePair.containsKey("Fatih"));

    }
}
