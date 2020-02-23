package day50;

import java.util.Arrays;
import java.util.List;

public class MathTest {
    public static void main(String[] args) {


    Addition a1 = new Addition(10, 90);
        System.out.println("a1 before calc : " + a1);
        a1.calculate();
        System.out.println("a1 after calc : " + a1);
        System.out.println(a1.calculated);

        Subtraction s1 = new Subtraction(10,90);
        System.out.println("s1 before calc: " + s1);
        s1.calculate();
        System.out.println("s1 before calc: " + s1);

        Multiplication m1 = new Multiplication(10,90);
        System.out.println("m1 = " + m1);
        m1.calculate();
        System.out.println("m1 = " + m1);

        Division d1 = new Division(10,90);
        System.out.println("d1 = " + d1);
        d1.calculate();
        System.out.println("d1 = " + d1);

        Division d2 = new Division(10,0);
        System.out.println("d2 = " + d2);
        d2.calculate();
        System.out.println("d2 = " + d2);

        System.out.println("===================================================");
        List<Question>allTestQuestions = Arrays.asList(a1,s1,m1,d1,d2);
        for(Question each : allTestQuestions){
            //each.calculate(); -- we don't need that as it's already calculated above for all objects
            System.out.println("each = " + each);
        }

    }
}
