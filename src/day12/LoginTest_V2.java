package day12;

public class LoginTest_V2 {
    public static void main(String[] args) {

        String username = "abc123";
        boolean usernameCorrect = username.equals("ABC123");
        System.out.println(usernameCorrect);

        boolean usernameCorrect2 = username.equalsIgnoreCase("ABC123");
        System.out.println(usernameCorrect2);

        String myName = "Andrea";
        boolean myNameUpper = myName.equals("ANDREA");
        System.out.println(myNameUpper);
        boolean myNameIgnore = myName.equalsIgnoreCase("ANDREA");
        System.out.println(myNameIgnore);
        System.out.println(myName.equalsIgnoreCase("AnDrEa"));
    }
}
