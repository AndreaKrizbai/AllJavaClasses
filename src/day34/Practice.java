package day34;

public class Practice {
    public static void main(String[] args) {
        System.out.println(Build3DigitNumber(0,7,6));
        int result1 = Build3DigitNumber(6,4,0);
        int result2 = Build3DigitNumber(6,14,0);
        System.out.println("(result1 + result2) = " + (result1 + result2));

        login1("user", "abc123");
        System.out.println(login2("u", "abc123"));
    }

    /**
     *
     * @param digit1
     * @param digit2
     * @param digit3
     * @return
     */
    public static int Build3DigitNumber (int digit1, int digit2, int digit3) {
        if (digit1 < 0 || digit1 > 9 ) {
           digit1 = 0;
        }
        if (digit2 < 0 || digit2 > 9 ) {
            digit2 = 0;
        }
        if (digit3 < 0 || digit3 > 9 ) {
            digit3 = 0;
        }
        int result = digit1*100 + digit2*10 + digit3;
        return (result);
    }

    public static void login1 (String username, String password){
        if(username.equals("user")&&password.equals("abc123")){
            System.out.println("Login successful");
        } else if(username.equals("user") && !password.equals("abc123") ){
            System.out.println("Your password is not correct");
        } else if(!username.equals("user") && password.equals("abc123") ){
            System.out.println("Your username is not correct");
        } else {
            System.out.println("Neither your username or password is correct");
        }
    }

    public static boolean login2 (String username, String password) {

        return username.equals("user")&&password.equals("abc123");

    }


}
