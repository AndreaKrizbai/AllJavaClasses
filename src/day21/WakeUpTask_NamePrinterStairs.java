package day21;

        import java.util.Scanner;

public class WakeUpTask_NamePrinterStairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.nextLine();
        String output ="";

        for(int i = 0 ; i < name.length(); i++){
           output = output + name.charAt(i) + "->";
            System.out.println(output);
        }
    }
}
