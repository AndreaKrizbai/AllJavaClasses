package day48;

public class Kangaroo implements Bounceable, BoxerWithBellyPouch {

    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance){
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

    @Override
    public void bounce() {
        System.out.println(name + " can jump " + jumpDistance
                + " meters forward and it would be nice to have " + GRAVITY + " gravity");
    }

    public void boxing(){
        System.out.println(name + " boxes");
    }

    public void carryChildInThePocket(){
        System.out.println(name + " carries child in pocket");
    }

    public void eat(){
        System.out.println(name + " eats  grasses, flowers, leaves, ferns, moss and even insects");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }

}
