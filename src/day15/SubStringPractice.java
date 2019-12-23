package day15;

public class SubStringPractice {
    public static void main(String[] args) {

        String movie = "Lord Of The Ring";

        String wordOf = movie.substring(5, 7);
        System.out.println("wordOf = " + wordOf);

        String wordThe = movie.substring(8, 11);
        System.out.println("wordThe = " + wordThe);

        int startingPoint = movie.indexOf(" ") + 1;
        int endingPoint = movie.length();

        System.out.println("Second word till last: "
                + movie.substring(startingPoint, endingPoint));

        String secondWordTillLast = movie.substring(5,16);
        System.out.println("second word till last: " + secondWordTillLast);

        String wordLordOf = movie.substring(0,7);
        System.out.println("wordLordOf = " + wordLordOf);

String secondToLast = movie.substring(5);
        System.out.println(secondToLast);

        System.out.println(movie.substring(12,16) + " " + movie.substring(5,7) + " " + movie.substring(8,11)
         + " " + movie.substring(0,4));

        System.out.println(movie.substring(12) + movie.substring(4,12) + movie.substring(0,4));

        String wordRing = movie.substring(12);
        String wordOfThe = movie.substring(4,12);
        String wordLord = movie.substring(0,4);
        System.out.println(wordRing + wordOfThe + wordLord);

        System.out.println(wordRing + wordOfThe + "Java " + wordLord);
    }
}
