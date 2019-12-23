package day16;

public class CountFrom10To1 {
    public static void main(String[] args) {

        int count = 10;
        while(count > 0){
            System.out.println(count--);
        }

       count = 10;
       while (count!=0){
           System.out.println(count);
            --count;
        }
    }
}
