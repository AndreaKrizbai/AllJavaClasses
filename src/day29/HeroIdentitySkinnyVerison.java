package day29;

public class HeroIdentitySkinnyVerison {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";

        String stars = "";
        for (int i = 1; i <= hero1.split("-")[1].length(); i++)
            stars += "*";

        //System.out.println("stars = " + stars);

        //String heroX = hero1.replace(heroSplitted[1], stars);
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + hero1.replace(hero1.split("-")[1], stars));

    }
}