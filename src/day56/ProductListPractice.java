package day56;

import java.util.ArrayList;
import java.util.List;

public class ProductListPractice {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Product sony = new Product("Sony TV",499);
        productList.add( new Product("Macbook Pro", 2999) ) ;
        productList.add( new Product("Sony TV", 499) ) ;
       // productList.add(sony);
        productList.add( new Product("Macbook Air", 1299) ) ;
        productList.add( new Product("Iphone X", 999) ) ;
        productList.add( new Product("Iphone XL", 1299) ) ;
        productList.add( new Product("Samsung 10", 1188) ) ;
        productList.add( new Product("Samsung Note", 1288) ) ;

        System.out.println("productList.size() = " + productList.size());
        //check whether we have "Sony TV" with 499 price

//        boolean result = false;
//        for(Product each : productList){
////            if(each.getName().equals("Sony TV") && each.getPrice()==499){
////                result = true;
////            }
//
//            if(each.equals(new Product("Sony TV",499))){
//                result = true;
//            }
//
//        }
       // Product sony = new Product("Sony TV",499);
        boolean result = productList.contains(sony);
        System.out.println("Has Sony TV with price 499 : " + result);
        boolean result2 = productList.contains(new Product("Apple TV",299));
        System.out.println("Has Apple TV with price 299 : " + result2);
        System.out.println("productList.indexOf(sony) = " + productList.indexOf(sony));
        productList.remove(sony);
        System.out.println(productList.size());
        System.out.println("Has Sony TV with price 499 after removing : " + productList.contains(sony));
        System.out.println("productList.indexOf(sony) after removing = " + productList.indexOf(sony));
    }
}
