package day19;

import java.util.Scanner;

public class HW_CharAndForLoop_Scanner {
            public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Enter your first character:");
                String firstChar = scan.nextLine();
                System.out.println("Enter your last character:");
                String lastChar = scan.nextLine();
                char char1 = firstChar.charAt(0);
                char char2 = lastChar.charAt(0);

                if(char1 < char2) {
                    for (char i = char1; i <= char2; i++) {
                        System.out.print(i + " ");
                    }
                } else {
                    for (char i = char1; i>=char2; i--){
                        System.out.println(i + " ");
                    }
                }

    }
}
