package day47;

public class GasCar extends Car {
    int gasLevel = 25;

    public void start() {
        System.out.println("Start the gas car");
    }

    public void goForward() {
        System.out.println("Gas car goes forward");
        gasLevel--;
    }

    public void goBackward() {
        System.out.println("Gas car goes backward");
        gasLevel--;
    }

    public void turn(String direction) {
        System.out.println("Gas car turns " + direction);
    }
}
