package day49;

public class Tesla extends Vehicle implements Autonomous, Chargable{
    int horsePower;

    public Tesla(int horsePower, int year){
        super(year);
        this.horsePower = horsePower;
    }
    @Override
    public void selfDrive() {
        System.out.println("Tesla self-drives");
    }

    @Override
    public void start() {
        System.out.println("Tesla starts");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", year=" + year +
                '}';
    }

    @Override
    public void charge() {
        System.out.println("Tesla charges");
    }
}
