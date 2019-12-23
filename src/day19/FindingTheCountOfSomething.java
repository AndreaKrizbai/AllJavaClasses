package day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {

        int counter = 0;

        for(int i = 1; i<=100; i++){
            if(i%15==0){
                System.out.print(i + ", ");
                ++counter;
            }
        }
        System.out.println("counter = " + counter);

        String name = "Hello bello mi ujsag hogy vagyunk mennyi a van itt?";

        int countOfA = 0;
        
        for (int x = 0; x < name.length(); x++) {
            System.out.println(name.charAt(x));
            if(name.charAt(x)=='a'){
                System.out.println("BINGO");
                ++countOfA;
            }
        }
        System.out.println("countOfA = " + countOfA);
    }
}
