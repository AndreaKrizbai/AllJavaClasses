package day32;

public class Practice2_Array {

    public static void main(String[] args) {
        printMaxOfIntArray(new int[]{1,3,9,34,78,45,9,98,25,56});
        printSumOfIntArray(new int[]{4,5,3,90});
        checkScoresAllMoreThan60(new int[]{61,65,78});
    }

    public static void printMaxOfIntArray(int[] nums){
       int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]){
                max = nums[i];
            }
        }
        System.out.println(max);
    }

    public static void printSumOfIntArray(int[] nums ){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
          sum = sum + nums[i];
        }
        System.out.println(sum);
    }

    public static void checkScoresAllMoreThan60(int[] scores){
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]>60){
                count++;
            }
        } if(count==scores.length){
            System.out.println("Everyone has passed");
        } else {
            System.out.println("Someone has failed");
        }
    }
    // OPTIONALLY
    // checkScoresAllMoreThan60
    // this method has one int array as parameter
    // and it will check whether all the numbers are more than 60
    // if so print everyone passed
    // if not print someone has failed

}
