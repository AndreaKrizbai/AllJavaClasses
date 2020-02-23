package day39;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {

        /*
        Create an ArrayList of String to store 12 elements.
        Each element should contains product information separated by comma  :
        at index 0 -->> iPhone 6s, 499 , 18.71 and so on
         */
        ArrayList<String> productLst
                = new ArrayList<>(Arrays.asList("iPhone 6s,449,18.71",
                "iPhone 6s Plus,549,22.88",
                "iPhone X,1149,56.16",
                "MacbookPro,1499.99,79.49",
                "ThumbDrive,39.99,2.68",
                "Beats HeadPhones,349.99,15.12",
                "Mouse,79.99,8.98",
                "Charger,39.99,4.56",
                "iPad,429,18.31",
                "Dyson Vacuum,399,16.25",
                "TV,2199,89.49",
                "Apple Watch,559,21.18")
        );

        System.out.println("productLst = " + productLst);
        System.out.println("element count" + productLst.size());

//        String itemDetails = "iPhone 6s,449,18.71";
//        System.out.println("item name = " + itemDetails.split(",")[0]);
//        System.out.println("item price = " + itemDetails.split(",")[1]);
//        System.out.println("item monthly = " + itemDetails.split(",")[2]);

//         * Task 1 : print only items name
        for(String eachProduct : productLst){
            String namePart = eachProduct.split(",")[0];
            System.out.println("each product name (for each loop) = " + namePart);
        }

            for (int i = 0; i < productLst.size(); i++) {
                String namePart = productLst.get(i).split(",")[0];
                System.out.println("For loop version : " + namePart);
            }
        
//         * Task 2 : print all the prices more than 500
        for(String eachProduct : productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if (price > 500) {
                System.out.println("price = " + price);
            }
        }

//         * Task 3 : print average price
            double sum = 0;
            double average = 0;
        for(String eachProduct : productLst) {
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            sum = sum + price;
        }
        average = sum / productLst.size();
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);

//         * Task 4 : print all the items name that has less than 20$ monthly payment.
        for(String eachProduct : productLst) {
            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);
            if (monthly < 20) {
                System.out.println(name + " " +monthly);
            }
        }
//         * Task 5 : Print the monthly payments of all the iPhone no matter what model.
        System.out.println("----------------Task 5------------------");
        for(String eachProduct : productLst) {
            String name = eachProduct.split(",")[0];
            double monthly = Double.parseDouble(eachProduct.split(",")[2]);
            if(name.contains("iPhone")){
                System.out.println(name + " " + monthly);
            }
        }

//         * Task 6 : Print all information about most expensive items.
        double maxPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
        int maxPriceIndex = 0;
        for (int i = 0; i < productLst.size(); i++) {
            double price = Double.parseDouble(productLst.get(i).split(",")[1]);
            if(price>maxPrice){
                maxPrice=price;
                maxPriceIndex = i;
        }
        }
        System.out.println("maxPriceIndex = " + maxPriceIndex);
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("Most expensive item " + productLst.get(maxPriceIndex));

        double maxEachPrice = Double.parseDouble(productLst.get(0).split(",")[1]);
    String maxPriceItem = "";
        for(String eachProduct : productLst){
            double price = Double.parseDouble(eachProduct.split(",")[1]);
            if(price>maxEachPrice){
                maxEachPrice=price;
                maxPriceItem = eachProduct;
            }
        }
        System.out.println(maxPriceItem);
        System.out.println(productLst.indexOf(maxPriceItem));

        System.out.println("\n------------------Task 7------------------");
//         * Task 7 : Update Dyson price to 80% off
//         *          (Monthly payment (24 month) should also be calculated accordingly)
        System.out.println(productLst.contains("Dyson"));
        System.out.println(productLst.indexOf("Dyson"));

        int dysonIndex = 0;
        for (int i = 0; i < productLst.size(); i++) {
            if(productLst.get(i).startsWith("Dyson")){
                dysonIndex = i;

        }   }
        System.out.println("dysonIndex = " + dysonIndex);
        String dysonDetails = productLst.get(dysonIndex);
        String name = dysonDetails.split(",")[0];
        double price = Double.parseDouble(dysonDetails.split(",")[1]);
        double monthly = Double.parseDouble(dysonDetails.split(",")[2]);
        dysonDetails = name + "," + price*0.2 + "," + monthly*0.2;
        System.out.println("dysonDetails = " + dysonDetails);
        productLst.set(dysonIndex, dysonDetails);
        System.out.println(productLst);


//         * Task 8 : Count the items prices more than average price.
            int count = 0;
            for (String eachProduct : productLst){
                double priceEach = Double.parseDouble(eachProduct.split(",")[1]);
                if(priceEach>average){
                    count++;
                }
            }
        System.out.println("count = " + count);

//         * OPTIONALLY :
//         * Task 9 : Remove all the items has more than average price.
        for (int i = 0; i < productLst.size(); i++) {
            double priceEach = Double.parseDouble(productLst.get(i).split(",")[1]);
            if(priceEach>average){
                productLst.remove(i);
                i--;
            }
        }
        System.out.println(productLst);
        System.out.println("productLst count : " + productLst.size());



//         * ------------------------
//         * Create 3 more ArrayList objects to separately store
//         *  itemNames(String), prices(Double) , monthlyPayments(Double)  :

        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double>monthlyPayments = new ArrayList<>();

        for(String eachProduct : productLst){
            itemNames.add(eachProduct.split(",")[0]);
//            double pricePart = Double.parseDouble(eachProduct.split(",")[1]);
//            prices.add(pricePart);
            prices.add(Double.parseDouble(eachProduct.split(",")[1]));
            double monthlyPart = Double.parseDouble(eachProduct.split(",")[2]);
            monthlyPayments.add(monthlyPart);
        }
        System.out.println("item names : " + itemNames);
        System.out.println("Prices : " + prices);
        System.out.println("monthlyPayments = " + monthlyPayments);
    }

}
