package day48;

public class Lion extends Mammals {

    @Override
    public void drinkMilk() {
        System.out.println("LION DRINKS MILK");
    }

    @Override
    public void makeNoise() {
        System.out.println("LION SAYS ROARRRRRRR!!!");
    }



    public static void main(String[] args) {
        Lion l1 = new Lion();
        //I can create a new object, just the leash is the same
        l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        System.out.println("--------------------------");
        Animal a1 = new Lion();
        a1.makeNoise();

    }
}
