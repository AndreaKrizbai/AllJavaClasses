package day47;

public class Garage {

    public static void main(String[] args) {

        //Abstract class cannot be instantiated
       // Car c1 = new Car();
        ElectricCar e1 = new ElectricCar();
        e1.start();
        e1.goForward();
        e1.goBackward();
        e1.turn("right");

        System.out.println("--------------------------------");
        GasCar g1 = new GasCar();
        System.out.println("g1.gasLevel = " + g1.gasLevel);
        g1.start();
        g1.goForward();
        g1.goBackward();
        g1.turn("left");
        System.out.println("g1.gasLevel = " + g1.gasLevel);

        System.out.println("--------------------------------");
        Rectangle r1 = new Rectangle(5,5);
        System.out.println("r1 before calculating = " + r1);
        r1.calculateArea();
        System.out.println("r1 = " + r1);

    }
}
