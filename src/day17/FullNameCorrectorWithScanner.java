package day17;

import java.util.Scanner;

public class FullNameCorrectorWithScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fullName = scan.nextLine();

        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0,indexOfSpace+1);
        String lastName = fullName.substring(indexOfSpace+1);

        String firstNameCorrected =
                firstName.toUpperCase().substring(0,1) +
                        firstName.substring(1).toLowerCase();
        System.out.println(firstNameCorrected);

        String lastNameCorrected = 
                lastName.substring(0,1).toUpperCase() +
                        lastName.substring(1).toLowerCase();
        System.out.println(lastNameCorrected);
        
        fullName = firstNameCorrected + lastNameCorrected;
        System.out.println(fullName);
        
    }
}
