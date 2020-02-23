package day55;

public class Casting {
    public static void main(String[] args) {
        int x = 10;
        //this works implicitly/automatically
        long y = x;
        //this needs to be casted explicitly
        byte b = (byte) x;

        Object o = new Dog("Chiwava");
       // o.bark(); - doesn't work
        Dog d = (Dog) o; //this is downcasting from type Object to Dog
        d.bark();
        //in order to let the Dog object bark, we need to refer
        // a dog as a Dog or we don't have access to Dog stuff
        System.out.println(d.type);

//        Object o2 = new Object();
////        Dog d2 = (Dog) o2;
        //this will throw CLASS CAST EXCEPTION

        Dog d1 = new Dog("vizsla"); //this is new object
        long a = 2356375985625889l;
        System.out.println(a);
        int a1 = (int) a;
        System.out.println(a1);

    }
}
