package day24;

public class ShoppingWithArray {
    public static void main(String[] args) {
        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
//        String[] groceryItems2 = new String[]{"a", "b", "c"};
//        String [] groceryItems3 = new String[6];


        int itemCount = groceryItems.length;
        int lastItemIndex = itemCount -1;
        String lastFruit = groceryItems[lastItemIndex];
//        String lastItem = groceryItems[groceryItems.length-1];

        for( String eachItem : groceryItems){
            System.out.print(eachItem);
            if(!eachItem.equals(lastFruit)){
                System.out.print(", ");
            }
        }



    }
}
