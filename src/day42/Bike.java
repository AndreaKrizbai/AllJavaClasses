package day42;

public class Bike {
    int speed;
    int gear;

    public Bike(){
        System.out.println("Message from constructor");
        gear = 1;
    }

    public Bike(int newGear){
        gear = newGear;
    }

    public Bike (int gear, int speed){
        //to make it obvious, we are talking about
        // the field, not the method parameter
        this.gear = gear;
        this.speed = speed;
    }

    public Bike(String str){
        System.out.println("ACCEPT STRING!!!");
    }

}
