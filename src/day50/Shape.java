package day50;

public abstract class Shape implements Drawable{
    //abstract class is not required to implement inherited abstract methods of the interface

    String name;
    double area;

    public Shape(String name){
        this.name = name;
    }

    public abstract void calculateArea();
  //public abstract void draw();
}
