package day17;

public class FullNameCorrector {
    public static void main(String[] args) {

        String fullName = "andrea krizbai";

        String firstName = fullName.substring(0,6);
        String lastName = fullName.substring(7);

        String firstNameCorrected =
                firstName.toUpperCase().substring(0,1) +
                        firstName.substring(1).toLowerCase();
        System.out.println("firstNameCorrected = " + firstNameCorrected);

        String lastNameCorrected = 
                lastName.substring(0,1).toUpperCase() +
                        lastName.substring(1).toLowerCase();
        System.out.println("lastNameCorrected = " + lastNameCorrected);
        
        fullName = firstNameCorrected + " " + lastNameCorrected;
        System.out.println(fullName);
        
    }
}
