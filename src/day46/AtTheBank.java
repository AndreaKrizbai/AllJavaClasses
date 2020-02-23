package day46;

public class AtTheBank {
    public static void main(String[] args) {

        CheckingAccount account1 = new CheckingAccount("Zehra",54321, 10000);
        account1.deposit(100);
        System.out.println("account1 = " + account1);
        account1.deposit(5000);
        System.out.println("account1 = " + account1);
        account1.withdraw(5300);
        System.out.println("account1 = " + account1);
    }
}
