package day21;

public class SearchingInString3 {
    public static void main(String[] args) {
        String name = "Andrea Krizbai Andrea Dreah Rea";

        System.out.println("Char counts: " + name.length());

        int count = 0;
        for (int i = 0; i<= name.length()-3; i++){
            String currentChar = name.substring(i,i+3);

            if(currentChar.equalsIgnoreCase("rea")){
                System.out.println("The index of rea: " + i);
 //               count = count + 1;
//                count += 1;
//                ++count;
                count++;
            }
        }   System.out.println(count);
    }
}
