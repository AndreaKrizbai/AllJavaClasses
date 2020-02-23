package day53;

public class FruitShopUtility {

    public static void main(String[] args) {
        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);
   displayFruit(f1);
   displayFruit(f2);
   displayFruit(new Apple("tasteless", "red", "Gala"));
        System.out.println("--------digestBetter---------");
   digestBetter(f1);
   digestBetter(new Orange("sweet", "yellowish", 1));
        System.out.println("--------getMyFavoriteFruit-----------");
        System.out.println(getMyFavoriteFruit());
        Fruit x = getMyFavoriteFruit();
        x.getDigested();
        System.out.println(x.toString());

        System.out.println("getFavoriteByType(1) = " + getFavoriteByType(1));
        System.out.println("getFavoriteByType(2) = " + getFavoriteByType(2));
        System.out.println("getFavoriteByType(3) = " + getFavoriteByType(3));

    }

    public static void digestBetter(Fruit anyFruit){
        anyFruit.getDigested();
        anyFruit.getDigested();
        anyFruit.getDigested();
        anyFruit.getDigested();
        System.out.println(anyFruit.toString());
    }

    public static Fruit getFavoriteByType(int type){
       if(type==1) {
           return new Apple("sweet","yellow", "Golden");
       } else if (type==2){
           return new Orange("crispy", "green",100);
       } else {
           return null;
       }
    }


    public static Fruit getMyFavoriteFruit(){
     //   return new Apple("sweet","yellow", "Golden");
   Fruit f = new Orange("crispy", "green",100);
    return f;
    }

    // displayFruit
    public static void displayFruit(Fruit anyFruit){
        System.out.println("Displaying fruit \n" + anyFruit.toString());
    }

}
