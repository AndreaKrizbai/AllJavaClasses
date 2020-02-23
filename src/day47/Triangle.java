package day47;

public class Triangle extends Shape {

    int height;
    int base;

   public Triangle(int height, int base){
       super("triangle");
       this.height = height;
       this.base = base; 
   }

    public void calculateArea(){
        area = height * base/2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", base=" + base +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
