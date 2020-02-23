package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {
    String name;
   private List<Product> allProducts;

   public List<Product>getAllProductsMoreThanAveragePrice(){
       List<Product>myList = new ArrayList<>();
       double average = getAveragePrice();

       for(Product each : allProducts){
           if(each.getPrice()>average){
               myList.add(each);
           }
       }
       return myList;
   }

   public Product getMostExpensiveProduct(){
       //int max = allProducts.get(0).getPrice();
       //assume my max price is lowest number in Integer range so it will be replaced by any price
//       int max = Integer.MIN_VALUE;
//       int maxIndex = -1;
//       for (int i = 0; i < allProducts.size() ; i++) {
//           if (allProducts.get(i).getPrice() > max) {
//               max = allProducts.get(i).getPrice();
//               maxIndex = i;
//           }
//       }
//       System.out.println("max: " + max);
//       return allProducts.get(maxIndex);

       Product MaxProduct = null;
       int max = Integer.MIN_VALUE;
       for (Product each : allProducts) {
           if (each.getPrice() > max) {
               max = each.getPrice();
               MaxProduct = each;
           }
       }
       System.out.println("max = " + max);
       return MaxProduct;
   }

   public double getAveragePrice(){
      return findSumOfAllProductPrice()/getProductCount();
   }

   public int findSumOfAllProductPrice(){
       int sum = 0;
       for(Product each:allProducts){
           sum += each.getPrice();
       }
       return sum;
   }

   public boolean checkIfProductExists(Product p){
     return allProducts.contains(p);
   }

   public int indexOfProduct(Product p){
       return allProducts.indexOf(p);
   }

   public void removeProduct(Product p){
       if(checkIfProductExists(p)==true){
           allProducts.remove(p);
       }else{
           System.out.println("We don't have " + p);
       }
   }

   public void displayProducts(){
       System.out.println(name + " has below products: ");
       for(Product each : allProducts){
           System.out.println("\t each = " + each);
       }
   }

   public int getProductCount(){
       return allProducts.size();
   }

   public void addProduct(Product p){
       System.out.println("calling addProduct(Product p)");
       allProducts.add(p);
   }

   public void addProduct(String productName,int productPrice){
      // Product newP = new Product(productName,productPrice);
      // allProducts.add(newP);
       allProducts.add(new Product(productName,productPrice));

   }

    public Store(){
        this.name = "Cybertek Store";
       this.allProducts = new ArrayList<>();
    }

    public Store(String name, List<Product>otherList){
        this();
        this.name = name;
        allProducts.addAll(otherList);
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }
}
