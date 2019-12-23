package day26;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {

        String students = "Abbos,Zulyar,Zhibek, Hasan, Muge, Orhan, Susan";
        String [] allNames = students.split(",");
        for (int i = 0; i < allNames.length; i++) {
            System.out.println("Name" + (i+1) + " : " + allNames[i]);
            for (int x = 0; x < allNames[i].length(); x++) {
                allNames[i] = allNames[i].trim();
                if (x < allNames[i].length() - 1) {
                    System.out.print(allNames[i].charAt(x) + "-");
                } else{
                    System.out.print(allNames[i].charAt(x));
                }
            }
            System.out.println();
        }
    }
}
