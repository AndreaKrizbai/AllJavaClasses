package day11;

public class StringEqualityPractice_Condition {
    public static void main(String[] args) {

        String myStr = "Cava";

        if (myStr.equals("Java")) {
            System.out.println("Correct word");
        } else if (myStr.equals("Cava")) {
            System.out.println("Pumpkin");
        } else {
            System.out.println("Not Java, nor pumpkin");
        }
    }
}
