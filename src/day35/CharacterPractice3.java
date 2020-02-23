package day35;

public class CharacterPractice3 {

    public static void main(String[] args) {

        String str = "A34B123C4X";
        // Get the number out of this String
        // and store it into Integer variable num ;
    int sum = 0;
        for (int x = 0; x < str.length(); x++) {
           if (Character.isDigit(str.charAt(x))) {
                System.out.println("str.charAt(" + x + ") = " + str.charAt(x));
              sum = sum + Integer.parseInt(str.charAt(x)+"");

            }

        }

        System.out.println(sum);
        // ADDITIONALLY , GET THE SUM OF THE NUMBERS INSIDE A STRING
        // optionally make it a method



    }
}
