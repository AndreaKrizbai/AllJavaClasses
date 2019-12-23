package day27;

public class ArraysMinMax {
    public static void main(String[] args) {
// write a program that can find a min number from an array, do not use sort method
        int[] scores = {100, -99, -1000, 2000, 5000, 1, 2, 3, 4, 1231};
        int min = scores[0];
        int max = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (min>scores[i]){
                min = scores[i];
            }
            if (max<scores[i]){
                max=scores[i];
            }
        }
        System.out.println("Minimum number : " + min);
        System.out.println("Maximum number : " + max);

        int secondMin = scores[0];
        for (int i = 0; i < scores.length; i++) {
//            if(scores[i] == min){
//                continue;
 //           }
        if(secondMin > scores[i] && scores[i] != min){
                secondMin = scores[i];
            }
        }
        System.out.println("Second min : " + secondMin);

        int thirdMin = scores[0];
        for (int i = 0; i < scores.length; i++) {
  //         if(scores[i]==min || scores[i] == secondMin){
 //              continue;
  //         }
           if (thirdMin > scores[i] && scores[i] != min && scores[i] != secondMin){
               thirdMin = scores[i];
           }
        }
        System.out.println("Third min number : " + thirdMin);


    }
}
