package day48;

public class BounceAction {
    public static void main(String[] args) {
        Bounceable b1 = new Ball("round", "yellow");
        b1.bounce();
        System.out.println("b1 = " + b1);
        System.out.println(Ball.GRAVITY);

        Bounceable b2 = new Kangaroo("Smile", 25);
        b2.bounce();
        ((Kangaroo)b2).eat();
        System.out.println("b2 = " + b2);
        ((Kangaroo)b2).boxing();
        ((BoxerWithBellyPouch)b2).carryChildInThePocket();
    }
}
