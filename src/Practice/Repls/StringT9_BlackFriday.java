package Practice.Repls;

import java.util.Scanner;

public class StringT9_BlackFriday {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a valid URL:");
        String url = scan.next();

        System.out.println(url.indexOf("."));
        System.out.println(url.lastIndexOf("."));

        System.out.println(url.substring(url.indexOf(".")+1,url.lastIndexOf(".")));



    }
}
