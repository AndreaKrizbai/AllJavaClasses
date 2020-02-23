package day49;

public class IceCream extends Object implements Edible {
    @Override
    public void eat() {
        System.out.println("Eat your ice-cream with spoon!!! ");
    }

    @Override
    public void drink() {
        System.out.println("Drink your ice-cream if it melted in the cup");
    }

    @Override
    public void digest() {
        System.out.println("Digest ice-cream");
    }


    public static void main(String[] args) {
    IceCream i1 = new IceCream();
    i1.drink();
    i1.eat();
    i1.digest();
        System.out.println(i1.toString());
        System.out.println("------------------------------------");

        Juicy.squeeze();

        Object o1 = new Object();
    }
}