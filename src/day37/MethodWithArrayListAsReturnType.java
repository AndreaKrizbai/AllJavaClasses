package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {
    public static void main(String[] args) {
        System.out.println(getListFrom1TillFinalNumber(7));
        System.out.println(getListFrom1TillFinalNumber(2));
        System.out.println(getListFrom1TillFinalNumber(20));

        List<Integer> myList = getListFrom1TillFinalNumber(25);
        System.out.println(myList);
    }

    /**
     * This method will return a List of Integer that containing numbers
     * starting from 1 till finalNumber
     * @param finalNumber this is the last item of the list
     * @return List</Integer> that contains 1 till finalNumber increased by 1
     */

public static List<Integer> getListFrom1TillFinalNumber (int finalNumber){
        List<Integer>nums = new ArrayList<>();
    for (int numbers = 1; numbers <= finalNumber; numbers++) {
        nums.add(numbers);
    }
    return nums;
}

}
