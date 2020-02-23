package day50;

public class Square extends Shape {
    // String name;
    // double area;
    int length;

    public Square(String name, int length) {
        super(name); //reusing functionality of super class
        this.length = length;
    }


    public void calculateArea(){
        area = length * length;
    }


    @Override
    public void draw() {
        System.out.println("Draw 4 equal lines with" +
                " 90 degree, length " + length +
        " with color " + COLOR); //coming from Drawable
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
