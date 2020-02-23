package day39;

public class Car {
    int year;
    String model;
    String make;
    String color;


    // instance methods are tied to the object
    // it doesn't have static keyword, we need an object when we call them
    public void goForward(){

        System.out.println(make + " Going forward");
    }

    public void printCarAge(){
        System.out.println("Car's age : " + (2020-year));
    }

    public void changeColor(String newColor){
        color = newColor;
    }

}

