package day14;

public class StringReview {
    public static void main(String[] args) {

        String str = "I like Pumpkin";

        System.out.println("str = " + str);

        System.out.println(str.equals("Pumpkin"));

        System.out.println("Does it contain Pumpkin: ");
        System.out.println(str.contains("Pumpkin"));

       boolean gotPumpkin = str.contains("Pumpkin");
        System.out.println("gotPumpkin = " + gotPumpkin);

        boolean startWithI = str.startsWith("I");
        System.out.println("startWithI = " + startWithI);
        boolean endWithPUMPKIN = str.endsWith("PUMPKIN");
        System.out.println("endWithPUMPKIN = " + endWithPUMPKIN);
    }
}
