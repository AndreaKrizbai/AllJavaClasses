package day51.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {

        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();

        System.out.println("-------------------------------------");

        Shape[]shapes = {s1,s2,s3,new Circle(),s3};
//        for(Shape each : shapes){
//            each.draw();
//        }
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }

        System.out.println("======================================");

        List<Shape>listOfShapes = new ArrayList<>(Arrays.asList(s1,s2,s3,new Circle(),new Circle()));
//        for(Shape each : listOfShapes){
//            each.draw();
//        }
        for(int i=0; i<listOfShapes.size();i++){
            listOfShapes.get(i).draw();
        }
    }
}
