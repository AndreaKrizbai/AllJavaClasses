package day46;

public class SavingAccount extends BankAccount {

    double interestRate;

    /**
     * A constructor to set all the fields value
     * @param accountHolder
     * @param accountNum
     * @param balance
     * @param interestRate
     */

    public SavingAccount(String accountHolder, long accountNum, double balance, double interestRate){
        super(accountHolder,accountNum,balance);
        this.interestRate = interestRate;
    }

    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("Mohammed",
                12345, 500, 4.2);

        System.out.println("s1 = " + s1);
        System.out.println("s1 = " + s1.toString());
//        s1.withdraw(100);
//        System.out.println("s1 = " + s1);
        s1.deposit(1000);
        System.out.println("s1 = " + s1);

    }
//in our Savingaccount, we get $30 penalty with every withdraw

    @Override
    public void withdraw (int amount){
      //  balance = balance - amount -30;
        super.withdraw(amount);
        super.withdraw(30);
    }

    @Override
    public void deposit (int amount){
        super.deposit((int) ((amount)*(1+interestRate/100)));
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
}
