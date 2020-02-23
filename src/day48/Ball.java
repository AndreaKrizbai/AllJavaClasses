package day48;

public class Ball implements Bounceable{

    String shape;
    String color;

    public Ball(String shape, String color){
        this.shape = shape;
        this.color = color;
    }

    @Override
    public void bounce() {
        System.out.println("This " + shape + " " + color + " ball is bouncing if gravity is " + GRAVITY);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
