package day16;

public class SecondWordGetter {
    public static void main(String[] args) {

        String sentence = "You understand Java";
        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

 //       System.out.println(sentence.substring(2,6));
        String secondWord = sentence.substring(firstSpaceIndex+1, lastSpaceIndex);
        System.out.println("secondWord = " + secondWord);
        
        String firstWord = sentence.substring(0, firstSpaceIndex);
        System.out.println("firstWord = " + firstWord);
        
 //       String lastWord = sentence.substring(lastSpaceIndex+1, sentence.length());
       String lastWord = sentence.substring(lastSpaceIndex+1);
        System.out.println("lastWord = " + lastWord);

        System.out.println(sentence.indexOf(" ", firstSpaceIndex +1));
    }
}
