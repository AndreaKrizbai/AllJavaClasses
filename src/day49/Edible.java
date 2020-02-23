package day49;

public interface Edible {

    public static boolean IS_HUMAN_FOOD = true;

    public abstract void eat();
    public abstract void drink();
    public default void digest(){
        System.out.println("You implement the code yourself");
    };
}
