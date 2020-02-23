package day51;

public class Drone implements UprightFlyable {
    @Override
    public void flyUpright() {
        System.out.println("Flying upright");
    }

    @Override
    public void fly() {
        System.out.println("Flying regularly");
    }
}
