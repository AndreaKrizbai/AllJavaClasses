package day47;
//this class is designed to be a super class - I only want this class to be super class to provide reusable fields and methods for sub classes
public abstract class Car {

    int year;
    String brand;

    //abstract method has keyword abstract, it doesn't have a body, does not have {}, it ends with ;
    // it's meant to be overridden to provide body in sub class
    public abstract void start();

    public abstract void goForward();
    public abstract void goBackward();
    public abstract void turn(String direction);

}
