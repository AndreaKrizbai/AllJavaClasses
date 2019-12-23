package day10;

public class MultiBranch_WithSwitch {

    public static void main(String[] args) {

        System.out.println("Welcome to McDonald's, what can I get for you?");

        String order = "";
        int itemNumber = 8;

        switch (itemNumber){
            case 11:
                System.out.println("You have selected 11");
                order = "Burger";
                break;
            case 5:
                System.out.println("You have selected 5");
                order = "French Fries";
                break;
            case 8:
                System.out.println("You have selected 8");
                order = "Nuggets";
                break;
            case 35:
                System.out.println("You have selected 35");
                System.out.println("Yay!! Yum!!!");
                System.out.println("Enjoy!!");
                order = "Ice-cream";
                break;
            default:
                System.out.println("You have selected unknown item number!!");
                order = "Unknown";
                break;
        }
        System.out.println("Your order is " + order);
    }
}
