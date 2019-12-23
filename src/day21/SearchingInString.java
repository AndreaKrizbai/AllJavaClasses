package day21;

public class SearchingInString {
    public static void main(String[] args) {
        String name = "Andrea Krizbai";

        System.out.println("Char counts: " + name.length());

        for (int i = 0; i<= name.length()-2; i++){
            String currentChar = name.substring(i,i+2);

            if(currentChar.equalsIgnoreCase("ai")){
                System.out.println("The index of ai: " + i);
            }
        }
    }
}
