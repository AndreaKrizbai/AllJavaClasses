package day41;

import day40.BankAccount;

public class AccessModifierIntro {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.showAccountBalance();
        b1.balance = 1000;

        Person p1 = new Person();
//        p1.name = "Hasan";
//        p1.age = 19;
//        p1.ssn = 123456789;
        
        p1.setAll("Hasan",34,123456789);
        System.out.println("p1 = " + p1);
        System.out.println(p1.getName());
        p1.setName("Emma");
        System.out.println(p1.getName());
        p1.setAge(21);
        p1.setSsn(111223333);

        int emmaAge = p1.getAge();
        System.out.println("emmaAge = " + emmaAge);
        System.out.println("p1 = " + p1);
    }
}
