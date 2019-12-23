package day11;

public class StringEqualityPractice_Switch {
    public static void main(String[] args) {

        String myStr = "Cva";

        switch (myStr) {
            case "Java":
            System.out.println("Correct word");
            break;
            case "Cava":
            System.out.println("Pumpkin");
            break;
            default:
            System.out.println("Not Java, nor pumpkin");
            break;
        }
    }
}
