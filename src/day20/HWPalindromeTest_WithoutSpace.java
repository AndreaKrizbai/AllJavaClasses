package day20;

public class HWPalindromeTest_WithoutSpace {
    public static void main(String[] args) {

        String name = "Nurses run";
        String reversedName = "";

        name = name.replace(" ","");

        for (int x = name.length()-1; x >=0 ; x--){
            reversedName = reversedName + name.charAt(x);
        }
        System.out.println("reversedName = " + reversedName);

        if(name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindrome test has passed");
        } else {
            System.out.println("Palindrome test has failed");
        }
    }
}
