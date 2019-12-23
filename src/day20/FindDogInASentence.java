package day20;

public class FindDogInASentence {
    public static void main(String[] args) {

        String msg = "I like dog, dogs are cute, dogs are friendly";

        int counter = 0;
        for (int i = 0; i <= msg.length()-3; i++) {
//           System.out.println(i + " : " + msg.substring(i,i+3));
            if(msg.substring(i,i+3).equals("dog")){
                System.out.println("BINGO at " + i);
                counter++;
            }
        }
        System.out.println(counter);
    }
}
