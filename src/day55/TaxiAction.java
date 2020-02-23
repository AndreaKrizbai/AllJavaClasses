package day55;

public class TaxiAction {
    public static void main(String[] args) {

        Engine e = new Engine("V6", 400);
        Driver d = new Driver("Andrea", 25);
        Taxi t1 = new Taxi(101,e,d);

        System.out.println("t1 = " + t1);
      //  System.out.println(t.toString());
        Taxi t2 = new Taxi(102,new Engine("V8",600),new Driver("Baba",1));
        System.out.println("t2 = " + t2);

        System.out.println(t2.dr.name + " is driving the taxi with horsepower " + t2.eng.horsePower);
        System.out.println(t2.dr);

        //how do I store the t2 plate number in a variable x:
        int x = t2.plateNumber;
        //how do I store the t2 Driver field in a variable y:
        Driver y = t2.dr;
        System.out.println("Driver's name " + y.name);
        System.out.println("Driver's name " + t2.dr.name);
        //how do I store t2 Engine field in a variable z:
        Engine z = t2.eng;
        System.out.println(z);
    }
}
