package day09;

public class DayPrinter {

    public static void main(String[] args) {

        int dayCode = 1;
        String dayName;

  //      if(dayCode == 1) {
  //          System.out.println("Day is Monday");
 //       }

        if (dayCode == 1) {
            dayName = "Monday";
        } else if (dayCode == 2) {
            dayName = "Tuesday";
        } else if (dayCode == 3) {
            dayName = "Wednesday";
        } else if (dayCode == 4) {
            dayName = "Thursday";
        } else if (dayCode == 5) {
            dayName = "Friday";
        } else if (dayCode == 6) {
            dayName = "Saturday";
            System.out.println("Yay, SATURDAY!!!");
        } else if (dayCode == 7) {
            dayName = "Sunday";
            System.out.println("Let's watch some football!");
        } else {
            dayName = "Unknown";
        }
        System.out.println("Day is " + dayName);
    }
}
