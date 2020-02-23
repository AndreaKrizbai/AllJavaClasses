package day40;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class HotMarketActions {
    public static void main(String[] args) {
        Offer o1 = new Offer();
        o1.company = "Google";
        o1.location = "North Bethesda";
        o1.isFullTime = true;
        o1.salary = 125000;
        o1.displayOfferDetails();

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.location = "Virginia";
        o3.isFullTime = false;
        o3.salary = 140000; 
        o3.displayOfferDetails();

        Offer o4 = new Offer();
        o4.displayOfferDetails();

        ArrayList<Offer>myOffers = new ArrayList<>();
        myOffers.add(o1);
        myOffers.add(o3);
        System.out.println("myOffers = " + myOffers);

        System.out.println("---------------My offers---------------");
        for(Offer each : myOffers){
            each.displayOfferDetails();
        }

        System.out.println("-------------My offers with for loop --------------");
        for (int i = 0; i < myOffers.size(); i++) {
            Offer each = myOffers.get(i);
            each.displayOfferDetails();
            //in one shot:
            //myOffers.get(i).displayOfferDetails();
        }
        
    }
}
