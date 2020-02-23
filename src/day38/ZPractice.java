package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ZPractice {
    public static void main(String[] args) {

        List<Double> hello= Arrays.asList(4.99,5.89,4.87,13.55);
        System.out.println(hello);
        List<Double>oneShot = new ArrayList<>(Arrays.asList(3.99,4.99,7.55,12.99,25.25));
        oneShot.remove(3);
        System.out.println(oneShot);

        oneShot.addAll(Arrays.asList(6.99,7.85));
        System.out.println(oneShot);

        ArrayList<Double>hello2 = new ArrayList<>();
        hello2.add(9d);
        hello2.add(3.33);

        oneShot.addAll(hello2);
        System.out.println(oneShot);

        oneShot.removeAll(Arrays.asList(3.99,7.55));
        System.out.println(oneShot);

        oneShot.sort(Comparator.reverseOrder());
        oneShot.sort(Comparator.naturalOrder());
        System.out.println(oneShot);
    }
}
