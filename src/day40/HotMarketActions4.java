package day40;

public class HotMarketActions4 {
    public static void main(String[] args) {
        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;

        String o1Str = o1.toString();
        System.out.println("o1Str = " + o1Str);
        //System.out.println(o1.toString());
        System.out.println(o1);

        Offer o3 = new Offer();
        o3.company = "Amazon";
        o3.location = "Virginia";
        o3.isFullTime = false;
        o3.salary = 140000;

        Offer o4 = new Offer();



    }
}
