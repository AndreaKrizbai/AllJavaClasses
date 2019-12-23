package day19;

public class CharAndForLoop {
    public static void main(String[] args) {

        int x = 'A';
        System.out.println(x);

        char myChar = 'A';
        System.out.println(myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);
        System.out.println(++myChar);

        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }

        String line = "";
        for (char i = 'A'; i <= 'Z'; i++) {
            line += i;
            System.out.println(line);
        }
    }
}
