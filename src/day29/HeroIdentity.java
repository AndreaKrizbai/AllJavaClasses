package day29;

public class HeroIdentity {
    public static void main(String[] args) {

            String hero1 = "Superman-Clark J Kent";

            // hide hero's identity by "Superman-***********"

            String [] heroSplitted = hero1.split("-");


            String star = "";

        for (int i = 0; i < heroSplitted[1].length(); i++) {
            star = star + "*";
        }

//        heroSplitted[1] = star;
//
//   //     System.out.println(heroSplitted[0]+ "-" + heroSplitted[1]);
//        String heroX = heroSplitted[0] + "-" + heroSplitted[1];
//        System.out.println(heroX);

        String heroReplaced = hero1.replace(heroSplitted[1],star);
        System.out.println(heroReplaced);





    }
}
