package day44;

public class Train extends Vehicle {
    int wagonCount;

    public void makeChoChoSound(){
        System.out.println("CHOOOOO CHOOOOO");
    }

    public static void main(String[] args) {
         Train t1 = new Train();
         t1.makeChoChoSound();
         t1.make = "Thomas";
         //t1.year = 1999;
        t1.setYear(1999);
        System.out.println(t1.getYear());
         t1.start();
         t1.goForward();
    }

}
