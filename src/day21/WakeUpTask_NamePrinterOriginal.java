package day21;

        import java.util.Scanner;

public class WakeUpTask_NamePrinterOriginal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.nextLine();

        for (int i = 0; i<= name.length()-1; i++){
            System.out.print(name.substring(i,i+1) + "->");
        }

        System.out.println();
        for(int i = 0 ; i <= name.length()-2; i++){
            System.out.print(name.substring(i,i+2) + "->");
        }

        System.out.println();
        for(int i = 0 ; i <= name.length()-3; i++){
            System.out.print(name.substring(i,i+3) + "->");
        }

        System.out.println();
        for(int i = 0 ; i <= name.length()-4; i++){
            System.out.print(name.substring(i,i+4) + "->");
        }

    }
}
