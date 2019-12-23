package day17;

        import java.util.Scanner;

public class NameEditer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scan.nextLine();

        String name2 = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("name2 = " + name2);

        String nameFixed = (name.charAt(0)+"").toUpperCase();
        nameFixed = nameFixed + name.substring(1).toLowerCase();
        System.out.println("nameFixed = " + nameFixed);

       String nameFixed2 = name.toUpperCase().substring(0,1);
       nameFixed2 += name.substring(1).toLowerCase();
        System.out.println("nameFixed2 = " + nameFixed2);

 /*      int firstSpace = name.indexOf(" ");
        String name3 = name.substring(0,1).toUpperCase() + name.substring(1, firstSpace+1).toLowerCase() + name.substring(firstSpace+1,firstSpace+2).toUpperCase() + name.substring(firstSpace+2).toLowerCase();
        System.out.println("name3 = " + name3);


  */
    }
}
