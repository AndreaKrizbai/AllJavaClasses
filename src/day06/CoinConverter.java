package day06;

public class CoinConverter {
    public static void main(String[] args) {

        int dollar = 2;
        System.out.println("You have $" + dollar);

        int cent = dollar * 100;

        cent -=99;
        System.out.println("You have spent " + (dollar*100-cent) + " cents.");
        int quarter = cent/25;
        int penny = cent%25;

        System.out.println("Now you have " + quarter + " quarter(s) and " + penny
        + " penny(s).");

        int dime = cent/10;
        int penny2 = cent%10;
        System.out.println("Or you have " + dime + " dime(s) and " +
                penny2 + " penny(s).");



    }


}
