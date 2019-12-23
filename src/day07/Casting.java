package day07;

public class Casting {
    public static void main(String[] args) {

        double bigNum = 10;
        System.out.println(bigNum);

        int num = (int) 12.99;
        System.out.println(num);

        long earthToMoon = 500000000;
        //int earthToMoonIn_int = (int) earthToMoon;
        System.out.println(earthToMoon);
        System.out.println((int) earthToMoon);
    }
}
