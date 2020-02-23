package day49;

public class Burger implements Edible, Juicy {
    //we have all this below, just not visible
    // public static boolean IS_HUMAN_FOOD = true;
    //    public Burger(){
    //        super();
    //    }


    @Override
    public void eat() {
        System.out.println("Eating burger with big bite");
    }

    @Override
    public void drink() {
        System.out.println("Eating burger then drink some soda");
    }

    @Override
    public void digest() {
        System.out.println("Digest burger");
    }

    @Override
    public void melt() {
        System.out.println("Juicy burger is melting");
    }
}
