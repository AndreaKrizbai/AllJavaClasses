package day52.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {

    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();
        accountList.add(new Account("Jon Snow", 10000));
        accountList.add(new Account("Vlad", 11000));
        accountList.add(new Account("Svetlana", 13000));
        accountList.add(new Account("Muhammad", 8000));
        accountList.add(new Account("Emme", 17000));
        accountList.add(new Account("Ata", 15000));

        System.out.println("accountList before = " + accountList);
        Collections.sort(accountList);
        System.out.println("accountList after = " + accountList);

        Account myAccount = new Account("Andrea", 25000);
       for(Account each : accountList){
           each.transferAll(myAccount);
       }
        System.out.println("myAccount = " + myAccount);

        //what can be the date type of a1?
        //Account a1, Comparable a1,
        //Transferable a1, Object a1

        Account a1 = new Account("Polymorphism1", 10000);
        Transferable t1 = new Account("Polymorphism2", 10000);
        Object o1 = new Account("Polymorphism3", 10000);

        t1 = a1;
        o1 = t1;
        
    }
}
