package day22;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char [] firstName = new char[6];
        System.out.println("<" + firstName[0] + ">");
        firstName[0] = 'A';
        firstName[1] = 'n';
        firstName[2] = 'd';
        firstName[3] = 'r';
        firstName[4] = 'e';
        firstName[5] = 'a';

        System.out.println(firstName[0]);
        System.out.println(firstName[1]);
        System.out.println(firstName[2]);
        System.out.println(firstName[3]);
        System.out.println(firstName[4]);
        System.out.println(firstName[5]);

        System.out.println("" + firstName[0] + firstName[1] + firstName[2] + firstName[3] +
                firstName[4] + firstName[5]);

        System.out.println(firstName);

        boolean[] yesNo = new boolean[2];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        yesNo[0]= 10==10;
        yesNo[1] = true;
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);

    }
}
