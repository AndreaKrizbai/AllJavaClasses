package day47;

public class ElectricCar extends Car {

    int batteryLevel;
    @Override
    public void start(){
        System.out.println("This is how electric car start");
    }

    public void goForward(){
        System.out.println("Electric car goes forward");
    }

    public void goBackward(){
        System.out.println("Electric car goes backward");
    }

    public void turn(String direction){
        System.out.println("Electric car turns " + direction);
    }

}
