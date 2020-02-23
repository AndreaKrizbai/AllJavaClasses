package day46;

public class BankAccount {

    String accountHolder;
    long accountNum;
    double balance;

    public BankAccount(){

    }

    public BankAccount(String accountHolder, long accountNum, double balance) {
        //super(); - it's here automatically - for Object Class
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void deposit (int amount){
        balance += amount;
       // balance = balance + amount;
    }

    public void withdraw (int amount){
        balance -= amount;
    }



}
