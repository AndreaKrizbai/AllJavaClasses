package day26;

public class ArrayTask_NumberTest {
    public static void main(String[] args) {
        // 1, write a program to test each element in an int array to see if it is more than 100 or not
// 2, write a program to print count of certain item in an array
// if item does not exists it should print 0 , if not print the count of the item
// 3 , given a String with multiple word. get an array of words then reverse the array
// 4 , OPTIONAL : reverse each word in a sentence after getting an array of words

        int[] scores = {156,101,76,187,87,110};
        int size = scores.length;
        System.out.println("size = " + size);
//LOGIC 1 : check each item if it less than 100, count and if count is more than 0
// at the end, answer is NO
String finalResult = "";
        int cntLessThan100 = 0;
        for (int eachNumber : scores){
            if (eachNumber<=100){
 //               System.out.println(eachNumber);
                cntLessThan100++;
            }
        }
        System.out.println("count less than 100 = " + cntLessThan100);
        if(cntLessThan100>0){
            finalResult = "NO";
        } else {
            finalResult = "YES";
        }
        System.out.println(finalResult);
//LOGIC 1.2 :
        int cntMoreThan100 = 0;
        for (int eachNumber : scores){
            if (eachNumber>100){
//                System.out.println(eachNumber);
                cntMoreThan100++;
            }
        }
        System.out.println("count more than 100 = " + cntMoreThan100);
        if(cntMoreThan100 == scores.length){
            finalResult = "YES";
        } else {
            finalResult = "NO";
        }
        System.out.println(finalResult);

        //LOGIC 2: break every time it finds an item more than 100, then assign NO to final result
        for(int eachNum : scores){
            if(eachNum <= 100){
               finalResult = "NO";
               break;
            }
        }
        System.out.println(finalResult);


        //LOGIC 3: minus 100 and if any number negative, answer is NO
        //LOGIC 4: find minimum number, if it's more than 100, then answer is YES
    }
}
