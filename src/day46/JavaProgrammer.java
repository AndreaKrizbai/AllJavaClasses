package day46;

public class JavaProgrammer extends Programmer {

    void drinkCoffee(){
        System.out.println("drinks coffee");
    }
    void doRepl(){
        System.out.println("does repl.it");
    }
    void doJavaDevelopment(){
        System.out.println("does Java development");
    }

    @Override
    void code() {
        super.code();
        System.out.println("Java programmer code");
    }

       void test() {
       // super.test();
        System.out.println("Java programmer test");
    }
}
