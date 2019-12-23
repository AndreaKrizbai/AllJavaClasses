package day29;
public class HeroIdentity_Justice_FromClassMate {
    public static void main(String[] args) {

        String [] heros = {
                "Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"
        };

        for (String eachHero: heros) {
            String[] heroSplit = eachHero.split("-");

            eachHero = heroSplit[0] + "-";

            for (int i = 0; i < heroSplit[1].length(); i++) {

                eachHero = eachHero + "*";
            }
            System.out.println(eachHero);

        }

    }
}