package day37;

import java.util.ArrayList;
import java.util.List;

// Create a method that accept a List of String as argument
// same thing as a method that has List of String parameter
// and print out each and every item in the list vertically
// return nothing
public class MethodWithArrayListParameter {
    public static void main(String[] args) {
        ArrayList<String> nameLst = new ArrayList<>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");

        printAList(nameLst);
        String resultLongest = getLongestElement(nameLst);
        System.out.println("result longest " + resultLongest);
    }

    public static void printAList(ArrayList<String> lst ){
        for (String each : lst) {
            System.out.println("each = " + each);
        }
    }
    public static String getLongestElement(List<String> nameLst) {

        String longestName = ""; //nameLst.get(0)

        for (int x = 0; x < nameLst.size(); x++) {
            String currentName = nameLst.get(x);
            // > will give you first longest name if you have more than one
            // >= will give you last longest name if you have more than one
            if (currentName.length() >= longestName.length()) {
                longestName = currentName;
            }
        }
        return longestName;
    }


}
