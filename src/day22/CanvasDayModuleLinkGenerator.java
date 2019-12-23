package day22;
public class CanvasDayModuleLinkGenerator {
    public static void main(String[] args) {
/*Here is the direct links to lead you to correct days
https://learn.cybertekschool.com/courses/278/modules#3317
this will lead you to day 21
https://learn.cybertekschool.com/courses/278/modules#3318
this will lead you to day 22
https://learn.cybertekschool.com/courses/278/modules#3319
this will lead you to day 23
https://learn.cybertekschool.com/courses/278/modules#3320
this will lead you to day 24
and so on
 */
String baseURL = "https://learn.cybertekschool.com/courses/278/modules#";
String dayMsg = "this will lead you to day ";

        for (int day = 21; day <=56 ; day++) {
            System.out.println(baseURL + (3296+day));
            System.out.println(dayMsg + day);

        }






    }
}
