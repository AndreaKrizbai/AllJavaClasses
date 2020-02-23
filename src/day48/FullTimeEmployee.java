package day48;

public class FullTimeEmployee extends Employee {

    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    public void calculateAnnualSalary(){
        System.out.println("Annual salary is " + (monthlySalary*12));
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", yearly salary=" + monthlySalary*12+
                '}';
    }
}
