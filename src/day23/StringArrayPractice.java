package day23;

public class StringArrayPractice {
    public static void main(String[] args) {
        
        String [] shows = {"Orville",
                            "Gifted",
                            "Game of Throne",
                            "Flash",
                            "Arrow",
                            "Super girl"};
        
        int showCount = shows.length;
        System.out.println("showCount = " + showCount);
        for (int i = 0; i < showCount; i++) {
            System.out.println(shows[i] + " has character count : " + shows[i].length());
        }
    }
}
