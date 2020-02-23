package day40;

import day39.Car;

public class HotMarketActions3 {
    public static void main(String[] args) {
        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = false;
        o1.salary = 140000;


        o1.displayOfferDetails();
        o1.turnToFullTime();
        o1.turnToFullTime();
        o1.changeLocation("DC");
        o1.displayOfferDetails();

        o1.changeAllInfo("Amazon","Virginia", 150000, true);
        o1.displayOfferDetails();

        System.out.println("Is it 100K or more offer? " + o1.is100KOffer());
      //  boolean result = o1.is100KOffer();
     //   if(result==true){
            if(o1.is100KOffer()){
           o1.changeLocation("Atlanta");
        }
        o1.displayOfferDetails();
        System.out.println(o1.toString());
    }
}
