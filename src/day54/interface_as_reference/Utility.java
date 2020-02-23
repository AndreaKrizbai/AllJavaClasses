package day54.interface_as_reference;

public class Utility {
    public static void main(String[] args) {
    Wearable w1 = new Clothes();
    wearMyWearable(w1);

    Wearable w2 = new Makeups();
    wearMyWearable(w2);

    Wearable w3 = new Watch();
    wearMyWearable(w3);

    Wearable w4 = new Perfume();
    wearMyWearable(w4);

    wearMyWearable( new Watch() );

        String result1 = getMyString();
        System.out.println("result1 = " + result1);


        System.out.println("\n ----calling the getMyWearableObject--- \n");
        Wearable result = getMyWearableObject();
        System.out.println("result = " + result);

        System.out.println(result.getClass().getSimpleName());
        wearMyWearable(result);
    }


    public static String getMyString(){
        //String str = new String("bla bla");
        return new String("bla bla");
    }


    public static void wearMyWearable(Wearable any){
        any.wear();
    }

    public static Wearable getMyWearableObject(){
        return new Clothes();
        //return new Watch();
        //return new Perfume();
        //return new Makeups();

    }

}
