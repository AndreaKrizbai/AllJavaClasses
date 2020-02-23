package day53;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitShop {
    public static void main(String[] args) {
        Apple a1 = new Apple ("sweet","red", "Fuji");

        System.out.println("a1.taste = " + a1.taste);
        System.out.println("a1.color = " + a1.color);
        System.out.println("a1.type = " + a1.type);
        a1.getDigested();

        System.out.println("-----------------------");
        Fruit f1 = a1;
        System.out.println("f1.color = " + f1.color);
        System.out.println("f1.taste = " + f1.taste);
        f1.getDigested();
        f1 = new Orange("sour-sweet", "redish", 11);
        f1.getDigested();
        System.out.println(f1.toString());

        System.out.println("-----------------------------");
        new Apple ("a","b","c").getDigested();

        Fruit f2 = new Apple("crispy but tasteless", "hot red", "Gala");

        Fruit f3 = new Orange("sour", "orange", 12);
        Fruit f4 = new Orange("very sweet", "blood red", 10);

//        String str = null;
//        System.out.println(str.charAt(0));

        Fruit[]myFruits = {f1,f2,f3,f4};
        for(Fruit each : myFruits){
            each.getDigested();
        }
        System.out.println("-----------------------");
        List<Fruit> fruitList = new ArrayList<>(Arrays.asList(f1,f2,f3,f4));
        //in the way, below, it's not resizable, adding and removing will not work, everything else will
        //List<Fruit> myF = Arrays.asList(f1,f2,f3,f4);
        for(Fruit each : fruitList){
            System.out.println("each.toString() = " + each.toString());
            System.out.println("Class Type: " + each.getClass().getSimpleName());
        }
    }
}
