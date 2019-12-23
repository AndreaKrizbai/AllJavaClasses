package day22;

public class LoopingThroughAnArray {
    public static void main(String[] args) {

        int [] scores = new int[4];
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

 //       int itemCount = scores.length;

        for (int i = scores.length-1; i >= 0; i--) {
            System.out.println(scores[i]);
        }
        System.out.println();

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }





    }
}
