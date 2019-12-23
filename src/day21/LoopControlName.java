package day21;

import java.util.Scanner;

public class LoopControlName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.nextLine();

        for (int i = 0; i <= name.length()-1; i++) {
            System.out.print(name.substring(i,i+1));
            if(name.substring(i,i+1).equalsIgnoreCase("b")){
                break;
            }
// System.out.print(name.substring(i,i+1)); - move this line here if I don't want to see 'b'
        }
    }
}
