package day54;

public abstract class Animal {
    public abstract void speak();
}

class Dog extends Animal implements IndoorPet{

    String name;

    public void speak(){
        System.out.println("BARK!!!");
    }

    @Override
    public void play() {
        System.out.println("Playing with the ball");
    }
}