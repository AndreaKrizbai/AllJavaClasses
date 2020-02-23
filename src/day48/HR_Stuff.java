package day48;

import java.util.Arrays;
import java.util.List;

public class HR_Stuff {

    public static void main(String[] args) {

        Employee e1 = new HourlyEmployee("Subi", 101, 55, 2000);
//        e1.calculateAnnualSalary();
//        System.out.println("e1 = " + e1);
      //  e1 = new FullTimeEmployee("Ainura", 103, 10000);
//        e1.calculateAnnualSalary();
//        System.out.println("e1 = " + e1);

        Employee e2 = new HourlyEmployee("Roksana", 102, 57, 2080);
        Employee e3 = new FullTimeEmployee("Dennis", 104, 13000);

//        e1=e3;
//        System.out.println("e1 = " + e1);

        List<Employee> allEmployees = Arrays.asList(e1, e2, e3);
        for(Employee each : allEmployees){
          //  System.out.println("each = " + each);
            System.out.println("Name is: " + each.name);
            System.out.println("ID: " + each.id);
            each.calculateAnnualSalary();
        }



    }
}
