package Practice.Repls;

import java.util.Scanner;

public class StringT5_Prefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name with prefix:");
        String name = scan.nextLine();

        if (name.toLowerCase().startsWith("dr")){
            System.out.println("Doctor");
        } else if (name.toLowerCase().startsWith("mr")){
            System.out.println("Male");
        } else if (name.toLowerCase().startsWith("miss")){
            System.out.println("Single female");
        } else if(name.toLowerCase().startsWith("mrs")){
            System.out.println("Married female");
        } else {
            System.out.println("No valid prefix found");
        }



    }
}
