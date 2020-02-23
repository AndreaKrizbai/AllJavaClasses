package day35;

public class ZPractice {
    public static void main(String[] args) {
        String twoNumbers = "100,600";
        String[]StrNums = twoNumbers.split(",");
        int num1 = Integer.parseInt(StrNums[0]);
        int num2 = Integer.parseInt(StrNums[1]);
        System.out.println("num1+num2 = " + (num1+num2));

        float f6 = Float.parseFloat("3.14f");
        System.out.println(f6);

        String sentence = "I bought 3 tomato and the price was 3.14 each";
        String [] words = sentence.split(" ");
        int tomatoCount = Integer.parseInt(words[2]);
        double tomatoPrice = Double.parseDouble(words[words.length-2]);
        System.out.println("Final checkout price is " + tomatoCount + " x $" +
                tomatoPrice + " = $" + tomatoCount*tomatoPrice) ;


    }
}
