package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {

        System.out.println("Java".equals("java"));

        String myStr = "Java";

        System.out.println(myStr.equals("Java"));

        String yourStr = new String("Java");
        System.out.println("Is my String same as your String?");
        System.out.println(myStr == yourStr);
        System.out.println(myStr.equals(yourStr));
        System.out.println(myStr != yourStr);

        if(myStr.equals(yourStr)){
            System.out.println("CORRECT WORD!!!");
        } else {
            System.out.println("SAY JAVA!!!");
        }


    }

}
