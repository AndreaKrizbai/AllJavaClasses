package day22;

public class LoopControlStatement2 {
    public static void main(String[] args) {

        String msg = "I struggle with Java I Like Java I love Java Everything is Awesome!";

        for (int idx = 0; idx < msg.length(); idx++) {
            if (idx % 2 == 1) {
                continue;
            }
            System.out.println(idx + " : " + msg.substring(idx, idx + 1));

        }

        for (int idx = 0; idx < msg.length(); idx++) {
            String currentChar = msg.substring(idx, idx+1);
            if(currentChar.equalsIgnoreCase("j")){
                break;
            }
            System.out.println("currentChar = " + currentChar);
        }
        
        
    }
}
