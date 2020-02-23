package day51.polymorphism;

public abstract class Animal {
    public abstract void makeNoise();
//    {
//        System.out.println("general animal noise");
//    }
}

class Dog extends Animal{
    @Override
public void makeNoise(){
    System.out.println("WOOF!!!");
}
}

class Horse extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("NEINEI");
    }
}