package day41;
//TV
//   attributes :
//	brand , isOn , currentChannel
//	String , boolean , int   (range from 1-50)
//   behaviours : 	turnOn, turnOff, getcurrentChannel, setcurrentChannel (newChannelNumber),
//   	moveForward, moveBackward

public class TV {

    String brand;
    boolean isOn;
    int currentChannel;

    public int getCurrentChannel(){
        return currentChannel;
    }

    public void setCurrentChannel (int newChannel) {
        if (newChannel < 0 || newChannel > 50) {
            System.out.println("Invalid channel, getting out");
            return; // early exit from the method
        }
            if (isOn == true) {
                currentChannel = newChannel;
            } else {
                System.out.println("TURN ON THE TV FIRST");
            }
        }

    public void turnOn(){
        if(isOn==false){
            System.out.println("Turning on TV");
            isOn = true;
        }
    }

    public void turnOff(){
        if(isOn==true){
            System.out.println("Turning off TV");
            isOn = false;
        }
    }

    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
