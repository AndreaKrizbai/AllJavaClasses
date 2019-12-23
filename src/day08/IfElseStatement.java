package day08;

public class IfElseStatement {
    public static void main(String[] args) {

int speedLimit = 60;
int yourCurrentSpeed = 55;
boolean IAmSpeeding = yourCurrentSpeed > speedLimit;

if (IAmSpeeding){
    System.out.println("Get pulled over by the police");
    System.out.println("Given ticket by the police");
    System.out.println("Taken away some points on your license");
    System.out.println("Go to court");
} else {
    System.out.println("Go shopping!!");
    System.out.println("Buy ice-cream!!");
    System.out.println("Enjoy your day!!");
}
        System.out.println("THE END");
    }
}
