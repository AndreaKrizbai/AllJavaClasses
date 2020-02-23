package day34;

public class Practice2 {
    public static void main(String[] args) {
      add(25);
      add(25,25);
      add(25,25,25);
      add(5999000999L, 899900999);
    }

    public static void add (int a){
        System.out.println(a+100);
    }

    public static void add (int a, int b){
        System.out.println(a+b);
    }

    public static void add (int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void add (long x, long y){
        System.out.println(x+y);
    }

}
