package Practice.Repls;

import java.util.Scanner;

public class StringT16_StringContainsWord {
    public static void main(String[] args) {
        /*Task 16:
        Enter user to ask two words
        and store it into word1 word2 String variables
        if word1 contains word2 ,
            print the location of word2 in word1
        for example ABCDE , BC  -->> BC is at index 1 in word1
                 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word1 = scan.next();
        System.out.println("Please enter another word:");
        String word2 = scan.next();

        int index = word1.indexOf(word2);

        if (word1.contains(word2)) {
            System.out.println(word2 + " is at index " + index + " in " + word1);
        }

    }
}
