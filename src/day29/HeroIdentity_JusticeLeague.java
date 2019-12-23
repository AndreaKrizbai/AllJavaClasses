package day29;

public class HeroIdentity_JusticeLeague {
    public static void main(String[] args) {
        String[] allHeroes = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "WonderWoman-Princess Diana",
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
                "Martian Manhunter-John Jones"};

        for (int i = 0; i < allHeroes.length; i++) {
            String [] heroSplitted = allHeroes[i].split("-");
            String star = "";
            for (int j = 0; j < heroSplitted[1].length(); j++) {
                star = star + "*";
            }
            System.out.println(allHeroes[i]);
            System.out.println(heroSplitted[0] + "-" + star);
        }
    }
}
