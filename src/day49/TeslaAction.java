package day49;

public class TeslaAction {
    public static void main(String[] args) {

        Tesla t1 = new Tesla(555, 2021);
        t1.start();
        t1.selfDrive();
        System.out.println(t1);
        t1.charge();
    }
}
