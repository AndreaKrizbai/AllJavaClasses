package day54;

public class AnimalShow {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.play();
        d1.speak();
        System.out.println(d1.name);

        //refer a dog object as an Animal
        //it can only do those things Animal can do
        // in this case, only speak method
        Animal a1 = d1;
        a1.speak();

        //refer a dog object as an Object
        //it can only do those things Object can do
        // for example toString, hasCode and others
        Object o1 = d1;

        IndoorPet p1 = d1;
        p1.play();

    }
}
