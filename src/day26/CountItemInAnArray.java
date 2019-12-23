package day26;

import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {

        String [] marvelHeroes = {"Iron Man", "Captain America", "Spiderman",
                                "Black Panther", "Hulk", "Black Widow", "Wanda",
                                "Captain Marvel", "Captain America", "Spiderman",
                                "Black Widow", "Wanda", "Captain Marvel",
                                "Captain America"};
        System.out.println("Marvel Heroes : " + Arrays.toString(marvelHeroes));

        System.out.println("Size of Array : " + marvelHeroes.length);

        String itemToSearch = "Captain America";
        int countOfItem = 0;
        int countOfBlack = 0;

        for( String eachHero : marvelHeroes){
            if(eachHero.equals(itemToSearch)){
                countOfItem++;
            }
        }
        System.out.println("Count of Captain America : " + countOfItem);

        for( String eachHero : marvelHeroes) {
            if (eachHero.toLowerCase().contains("black")) {
                countOfBlack++;
            }
        }
        System.out.println("Count of black : " + countOfBlack);
    }
}
