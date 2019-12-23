package day07;

import java.util.Scanner;

public class EmailBuilder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = scan.next();

        System.out.println("What is your last name?");
        String lastName = scan.next();
        scan.nextLine();

        System.out.println("What company do you work for?");
        String company = scan.nextLine();


        String fullName = firstName + " " + lastName;
        String email = firstName + lastName + "@" + company + ".com";
        System.out.println("My name is " + fullName + " and I work for " +
                company + " and my email is " + email);

        /*
        String firstName, lastName, company, email;
        firstName = "Andrea";
        lastName = "Krizbai";
        company = "smc";
        email = firstName + lastName + "@" +company + ".com";
        System.out.println("My name is " + firstName + " " + lastName + " and I work for " +
                company + " and my email is " + email);
*/

    }
}
