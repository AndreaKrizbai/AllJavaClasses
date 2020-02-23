package day55;

public class Taxi {
    int plateNumber;
    Engine eng;
    Driver dr;

    public Taxi(int plateNumber, Engine eng, Driver dr) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.dr = dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "Plate Number=" + plateNumber +
                ", Engine" + eng.toString() +
                ", Driver" + dr.toString() +
                '}';
    }
}


class Engine{
    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}

class Driver{
    String name;
    int driverID;

    public Driver(String name, int driverID) {
        this.name = name;
        this.driverID = driverID;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", driverID=" + driverID +
                '}';
    }
}