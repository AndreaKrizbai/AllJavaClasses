package day20;

public class MoreThanOneCharInString {
    public static void main(String[] args) {

        String name = "Andrea";

        for (int i = 0; i <= name.length()-1; i=i+2) {
            System.out.println(name.substring(i,i+2));
        }




    }
}
