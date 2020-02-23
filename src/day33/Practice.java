package day33;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumFrom1toX = getSumFrom1toX(25);
        System.out.println(sumFrom1toX);
 //       String NightWatchEmail = build_GOT_Email(scan.nextLine(),scan.nextLine());
 //       System.out.println(NightWatchEmail);
 //       System.out.println(build_GOT_Email(scan.nextLine(),scan.nextLine()));
        System.out.println(convertNumberToDay(4));
        int[]arr = {1,8,4,2,7};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(convertNumberToDay(arr[i]));
        }
        System.out.println(calculateAndReturnAge(2025));
        int[]birthYears = {1999, 122, 2019, 1987, 1978, 1964, 3999, 2004};
        for(int year : birthYears){
            System.out.println(calculateAndReturnAge(year));
        }

    }

    public static int getSumFrom1toX (int x){
        int sum = 0;
        for (int i = 1; i <= x; i++) {
//            sum = sum + i;
           sum += i;
        }
        return sum;
    }

    public static String build_GOT_Email (String firstName, String lastName){
        String result = firstName.charAt(0) + lastName + "@NightWatch.com";
        return result;
    }

    public static String convertNumberToDay (int dayCode) {
 //       String result = "";
        if (dayCode == 1) {
            return "Monday";
        } else if (dayCode == 2){
            return "Tuesday";
 //           result = "Tuesday";
        } else if (dayCode == 3){
            return "Wednesday";
  //          result = "Wednesday";
        } else if (dayCode == 4){
            return "Thursday";
  //          result = "Thursday";
        } else if (dayCode == 5){
            return "Friday";
 //           result = "Friday";
        } else if (dayCode == 6){
            return "Saturday";
 //           result = "Saturday";
        } else if (dayCode == 7){
            return "Sunday";
 //           result = "Sunday";
        } else {
            return "Funday";
 //           result = "Funday";
        }

   //     return result;
    }

    public static int calculateAndReturnAge (int birthYear){
        if(birthYear>1900 && birthYear<2020) {
            return (2019 - birthYear);
        }
  //      } else {
            return 0;
    }


}
