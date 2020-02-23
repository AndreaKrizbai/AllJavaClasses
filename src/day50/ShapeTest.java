package day50;

public class ShapeTest {
    public static void main(String[] args) {
        Square s1 = new Square("My precious",10);
        System.out.println("s1 = " + s1);
        s1.calculateArea();
        System.out.println("s1 with area calculation = " + s1);
        s1.draw();

        Circle c1 = new Circle("My circle",5);
        c1.calculateArea();
        System.out.println("c1 = " + c1);
        c1.draw();
    }
}
