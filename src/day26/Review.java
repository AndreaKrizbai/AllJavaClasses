package day26;

import java.util.Arrays;

public class Review {
    public static void main(String[] args) {
        int [] myNumbers = new int[4];   // 4 is item count
        // we assign value using array variable and it's index
        myNumbers[0]  = 10 ;
        myNumbers[1]  = 40 ;
        myNumbers[2]  = 30 ;
        myNumbers[3]  = 7 ;
        // how do we get the size of an array
        int size = myNumbers.length  ; // 4
        int lastIndex = size -1 ;  //myNumbers.length-1
        // How do we get last item of any array
        // i want to save last item into a variable
        //short lastItemValue = myNumbers[3] ;
        //short lastItemValue = myNumbers[lastIndex] ;
        int lastItemValue = myNumbers[myNumbers.length-1] ;
        // print third item
        System.out.println(  myNumbers[2] ) ; // 30
        // 1.1 i WANT TO add 1 to the second item value
        myNumbers[1] = myNumbers[1] + 1 ;
        // 1.2 i WANT TO double the second item value
        myNumbers[1] = myNumbers[1] * 2 ;
        // 1.3 I want to assign 3 item value to
        // sum of first and second item

        myNumbers[2] = myNumbers[0]+ myNumbers[1];
        int temp = myNumbers[0];
        myNumbers[0]= myNumbers[myNumbers.length-1];
        myNumbers[myNumbers.length-1] = temp;
        System.out.println(Arrays.toString(myNumbers));


    }
}
