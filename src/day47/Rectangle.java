package day47;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int width, int height){
        super("rectangle");
        this.width = width;
        this.height = height;
    }

    public void calculateArea(){
        area = width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

}
