package day10;

public class MultiBranch_Practice {

    public static void main(String[] args) {

        System.out.println("Welcome to McDonald's, what can I get for you?");

        String order = "";
        int itemNumber = 88;

        if(itemNumber == 11){
            System.out.println("You have selected 11");
            order = "Burger";
        } else if(itemNumber == 5){
            System.out.println("You have selected 5");
            order = "French Fries";
        } else if(itemNumber == 8){
            System.out.println("You have selected 8");
            order = "Nuggets";
        }else if(itemNumber == 35){
            System.out.println("You have selected 35");
            System.out.println("Yay!! Yum!!!");
            System.out.println("Enjoy!!");
            order = "Ice-cream";
        } else {
            System.out.println("You have selected unknown item number!!");
            order = "Unknown";
        }
        System.out.println("Your order is " + order);
    }
}
