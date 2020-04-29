package Practice.Repls;

import java.util.Scanner;

public class StringT15_ASCII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 3 characters:");
        String word = scan.next();
        
        /*Given a String str with 3 characters:
for example : DEV 
Store each character into 3 char variables
Store ASCII number of each character into int variables
hint : store char into int to get ASCII number
Then print it out by concatenating as below : 
"DEV IS NOW --> D68E69V86" 
         */
        char firstChar = word.charAt(0);
        char secondChar = word.charAt(1);
        char thirdChar = word.charAt(2);
        int a = firstChar;
        int b = secondChar;
        int c = thirdChar;

        System.out.println(word + " is now --> " + firstChar + a + secondChar + b + thirdChar + c);
        
    }
}
