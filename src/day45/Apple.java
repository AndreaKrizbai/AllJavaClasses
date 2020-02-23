package day45;

public class Apple extends Fruit {

   public Apple(){
        //I want to reuse the functionality already
        //written in super class constructor
     //  super();
       System.out.println("Message from Apple constructor");
   }

    public Apple(String str){
        super("hello");
        System.out.println("Message from Apple");
   }

    public static void main(String[] args) {
       Apple a1 = new Apple();
       Apple a2 = new Apple("test");
    }
}
