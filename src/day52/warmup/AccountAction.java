package day52.warmup;

public class AccountAction {

    public static void main(String[] args) {
        Account a1 = new Account("John Snow", 10000);
        Account a2 = new Account("Hannah", 7000);

        System.out.println("a1 before transfer = " + a1);
        System.out.println("a2 before transfer = " + a2);

        a1.transferAll(a2);
        System.out.println("a1 after first transfer = " + a1);
        System.out.println("a2 after first transfer = " + a2);

        a2.transferAll(a1);
        System.out.println("a1 after second transfer = " + a1);
        System.out.println("a2 after second transfer = " + a2);

        System.out.println("Is a1's name palindrome: " + a1.isPalindrome());
        System.out.println("Is a2's name palindrome: " + a2.isPalindrome());

        System.out.println(a1.compareTo(a2));


    }
}
