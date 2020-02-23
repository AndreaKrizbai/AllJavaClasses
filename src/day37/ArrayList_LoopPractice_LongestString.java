package day37;

import java.util.ArrayList;

public class ArrayList_LoopPractice_LongestString {
    public static void main(String[] args) {

        ArrayList<String> nameLst =new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        nameLst.add("Ayjerenjan");
        System.out.println("nameLst = " + nameLst);

        String longestName = nameLst.get(0);
        for (int i = 0; i < nameLst.size(); i++) {
            if(longestName.length() < nameLst.get(i).length()){
                longestName = nameLst.get(i);
            }
        }
 //       System.out.println(longestName);

        for (int i = 0; i < nameLst.size(); i++) {
            if(nameLst.get(i).length() == longestName.length()){
                System.out.println(nameLst.get(i));
            }
        }

        System.out.println("---------------------------------");
        for(String eachName : nameLst){
         if(eachName.length()>longestName.length())  {
             longestName = eachName;
         }
        }
        for(String eachName : nameLst){
            if(eachName.length()==longestName.length()){
                System.out.println(eachName);
            }

        }
        System.out.println(longestName);


    }
}
