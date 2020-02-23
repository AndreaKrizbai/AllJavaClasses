package day43;

public class ZzzPractice {

    private String type;
    private int caffeineLevel;
    private double price;

    public ZzzPractice(String type, int caffeineLevel, double price){
        if(price<=0){
            price = 1;
        }
        this.type = type;
        this.caffeineLevel = caffeineLevel;
        this.price = price;
    }

    public ZzzPractice(String type, int caffeineLevel) {
        this.type = type;
        this.caffeineLevel = caffeineLevel;
    }

    @Override
    public String toString() {
        return "Practice{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }
}
