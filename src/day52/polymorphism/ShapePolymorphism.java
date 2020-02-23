package day52.polymorphism;

public class ShapePolymorphism {
    public static void main(String[] args) {

        // Circle s1 = new Circle("penny",5);
        Shape s1 = new Circle("penny",5);
         //Object s1 = new Circle("penny",5);
        //Drawable s1 = new Circle ("penny",5);
        Shape s2 = new Rectangle("Book",10,5);

        //only the reference type decide what you can access with that variable
     //   s1.draw();
       // System.out.println(s1.toString());
        System.out.println(s1.getClass().getSimpleName());

        printAnyShapeArea(s1);
        printAnyShapeArea(s2);
        printAnyShapeArea(new Square("Bob",6));

        drawShape3Times(s1);
        drawShape3Times(new Square("Bob",6));
    }

    public static void drawShape3Times(Shape anyShape){
        anyShape.draw();
        anyShape.draw();
        anyShape.draw();

//        for (int i = 0; i < 3; i++) {
//            anyShape.draw();
//        }
    }


    //create a method that accepts any Shape and print out the calculated area
    public static void printAnyShapeArea(Shape anyShape){
        anyShape.calculateArea();
        System.out.println(anyShape.name+" 's area is = "+anyShape.area);

    }
}
