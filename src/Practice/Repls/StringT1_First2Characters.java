package Practice.Repls;

import java.util.Scanner;

public class StringT1_First2Characters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.nextLine();

        if(word.length() > 2){
            System.out.println(word.substring(0,2));
        } else if (word.length() == 1){
            System.out.println(word+word);
        } else {
            System.out.println("Empty String");
        }
    }
}
