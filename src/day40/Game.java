package day40;

public class Game {
    public static void main(String[] args) {
        SpaceShip s1 = new SpaceShip();
        s1.name = "Orville";
        s1.setInitialPosition(1,5);
        s1.move1Block("right");
        s1.move1Block("HOME");
//        s1.setDirection("right");
//        s1.move1Block();
//        s1.setDirection("ABC");
//        s1.move1Block();
//        s1.setDirection("right");
//        s1.move1Block();
        System.out.println(s1);
    }
}
