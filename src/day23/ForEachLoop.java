package day23;

public class ForEachLoop {
    public static void main(String[] args) {

        double [] prices = {99.23, 11.99, 100.23, 99.99, 56.34};

//        for (int i = 0; i < prices.length; i++) {
//            double eachPrice = prices[i];
//            System.out.println("Price" + i + ": "+ eachPrice);
//        }

        for(double blablabla : prices){
            System.out.println("Price = " + blablabla);
        }


    }
}
