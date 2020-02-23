package day40;

import java.util.ArrayList;

public class HotMarketActions2 {
    public static void main(String[] args) {
        Offer o1 = new Offer();
        o1.company = "Google";
        o1.location = "North Bethesda";
        o1.isFullTime = true;
        o1.salary = 125000;
        o1.displayOfferDetails();
        o1.turnToFullTime();

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.location = "Virginia";
        o3.isFullTime = false;
        o3.salary = 140000;
        o3.displayOfferDetails();

        Offer o4 = new Offer();
        o4.displayOfferDetails();

        //add 2K to the Amazon offer
        o3.salary += 2000;
        System.out.println("New Amazon salary : " + o3.salary);

        //set the salary value of o4 offer object to sum of all offers
        o4.salary = o3.salary + o1.salary;
        o4.displayOfferDetails();
        o4.turnToFullTime();
        o4.displayOfferDetails();
        o4.changeLocation("Rockville");
        o4.displayOfferDetails();
    }
}
