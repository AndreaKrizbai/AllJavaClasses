package day54.interface_as_reference;

public class Clothes implements Wearable {
    int size;

    public static void main(String[] args) {
        Clothes c1 = new Clothes();
        Wearable c2 = new Clothes();
        Object c3 = new Clothes();

        Watch w1 = new Watch();
        Wearable w2 = new Watch();
        Object w3 = new Watch();

        Cosmetics p1 = new Perfume();
        Wearable p2 = new Perfume();
        Object p3 = new Perfume();
        Perfume p4 = new Perfume();

        Cosmetics m1 = new Makeups();
        Wearable m2 = new Makeups();
        Object m3 = new Makeups();
        Makeups m4 = new Makeups();
    }

    @Override
    public void wear() {
        System.out.println("Wearing Clothes");
    }
}

class Watch implements Wearable{

    @Override
    public void wear() {
        System.out.println("Wearing Watch");
    }
}

class Perfume implements Wearable, Cosmetics{

    @Override
    public void wear() {
        System.out.println("Wearing Perfume");
    }
}

class Makeups implements Wearable, Cosmetics{

    @Override
    public void wear() {
        System.out.println("Wearing Makeups");
    }
}