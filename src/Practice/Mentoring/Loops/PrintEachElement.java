package Practice.Mentoring.Loops;

public class PrintEachElement {
    public static void main(String[] args) {
        int[]intArr = {1, 16, 32, 64, 128};
        for (int i=0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
        System.out.println("########################################");

        for (int each : intArr) {
            System.out.println(each);
        }
    }
}
