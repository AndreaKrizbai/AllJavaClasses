package Practice.Mentoring.Loops;

public class Basic {
    public static void main(String[] args) {
        
        System.out.print("For loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("For each loop: ");
        int [] array = {1,2,3,4,5};
        for (int each : array) {
            System.out.print(each + " ");
        }



    }
}
