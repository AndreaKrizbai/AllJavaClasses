package day14;

public class PasswordTask {
    public static void main(String[] args) {

        String password = "Ab5678129$";

 //       boolean min8max8 = password.length()>=8 && password.length()<=16;
 //       if(min8max8 && mustContain_or$ && mustNotContainSpace && mustStartWithAb){
        if(password.length() >= 8 && password.length() <= 16 &&
        password.contains("_") || password.contains("$") &&
        !password.contains(" ") && password.startsWith("Ab")){
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }






    }
}
