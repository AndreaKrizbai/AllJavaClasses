package day48;

public class HR_Action {
    public static void main(String[] args) {
        HourlyEmployee h1 = new HourlyEmployee("Hourly Bob", 123, 60.25, 2080);
        h1.calculateAnnualSalary();
        System.out.println("h1 = " + h1);

        System.out.println("------------------------------");
        FullTimeEmployee f1 = new FullTimeEmployee("Full Time Bob", 321, 12000);
        f1.calculateAnnualSalary();
        System.out.println("f1 = " + f1);


    }
}
