package day25;

import java.util.Arrays;

public class StringToCharArray_WithForLoop {
    public static void main(String[] args) {
        String myName = "Andrea Krizbai";

        char[] myNameInChar = myName.toCharArray();

        for (int i = 0; i < myName.length(); i++) {
            System.out.println(myNameInChar[i]);
        }
        int countForLoop = 0;
        for (int i = 0; i < myName.length(); i++) {
            if(myNameInChar[i] == 'a'){
                countForLoop++;
            }
        }
        System.out.println("countForLoop = " + countForLoop);



        for(char eachChar : myNameInChar){
            System.out.println("eachChar = " + eachChar);
        }

        int count = 0;
        for(char eachChar : myNameInChar){
            if(eachChar=='a'){
                count++;
            }
        }
        System.out.println("count = " + count);

        Arrays.sort(myNameInChar);
        System.out.println(Arrays.toString(myNameInChar));
    }
}
