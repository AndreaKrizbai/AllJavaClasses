package Practice.Mentoring.Loops;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("25 is a prime number: " + process(25));
        System.out.println("13 is a prime number: " + process(13));
    }

    public static boolean process(int number){
        boolean returnValue = true;
        for (int i = 2; i <= number/2; i++) {
            if(number%i==0){
                returnValue = false;
                break;
            } else{
                continue;
            }
        }
        return returnValue;
    }

}
