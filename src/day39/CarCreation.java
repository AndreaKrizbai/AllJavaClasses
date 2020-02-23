package day39;

import java.util.Scanner;

public class CarCreation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car car1 = new Car();
        car1.year = 2020;
        car1.make = "Toyota";
        car1.model = "Corolla";
        car1.color = "red";
        car1.goForward();
        car1.printCarAge();
        car1.changeColor(scan.next());

        Car car2 = new Car();
        car2.year = 2017;
        car2.make = "Hyundai";
        car2.model = "SantaFe";
        car2.color = "black";
        car2.goForward();
        car2.printCarAge();

        System.out.println(car1.year + " | " + car1.make + " | " + car1.model + " | " + car1.color);
        System.out.println(car2.year + " | " + car2.make + " | " + car2.model + " | " + car2.color);
    
        car2.year = 2020;
        System.out.println("car2.year = " + car2.year);
        car2.color = car1.color;
        System.out.println(car2.color);
    }
}
