package day17;

public class BackwardEvenNumberFinder {
    public static void main(String[] args) {

        int counter = 100;

        while(counter >= 0){
            if(counter%2==0){
                System.out.print(counter + " - ");
            }
            --counter;
        }

        System.out.println();

        counter = 101;
        while(--counter >= 0){
            System.out.print((counter--) + " ");
        }
    }
}
