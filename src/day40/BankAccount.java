package day40;

public class BankAccount {
    String accountType;
    String accountHolder;
    long accountNumber;
    public double balance;

    //setAllTheValue
    public void setAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber,
                               double newBalance){
        accountType = newAccountType;
        accountHolder = newAccountHolder;
        accountNumber = newAccountNumber;
        balance = newBalance;
    }

    //showAccountBalance
    public void showAccountBalance(){
        System.out.println("Current balance : " + balance);
    }
    //showAccountHolderAccountType
    public void showAccountHolderAccountType(){
        System.out.println("Account holder and type : " + accountHolder + " and " + accountType);
    }
    //getBalance - return the balance
    public double getBalance(){
        return balance;
    }
    //deposit(amount)
    public void deposit(double amount){
        balance = balance + amount;
}
    //withdraw(amount)
    public void withdraw(double amount){
        balance -= amount;
}
    //withdraw$100Cash()
    public void withdrwa$100Cash(){
        withdraw(100);
    }

    //purchaseProduct(productPrice, count)
    public void purchaseProduct(double productPrice, int count){
        withdraw(productPrice*count);
    }

    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
