package day12;

public class CarShopping {
    public static void main(String[] args) {

        String carBrand = "Tesla";
        int carPrice = 40000;
        int budget = 40000;

        if(carBrand.equals("Corolla") || (carBrand.equals("Tesla") && carPrice <= budget)){
            System.out.println("Car bought!");
        } else {
            System.out.println("Not what I am looking for");
        }

        if(carBrand.equals("Corolla")){
            System.out.println("Corolla bought");
        } else if (carBrand.equals("Tesla") && carPrice <= budget){
            System.out.println("Tesla bought");
        } else {
            System.out.println("Not what I am looking for");
        }


    }
}
