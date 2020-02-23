package day47;

public abstract class Shape {

    String name;
    int area;

    public Shape(String name){
        this.name = name;
    }

    public abstract void calculateArea();
    public abstract String toString();

}
