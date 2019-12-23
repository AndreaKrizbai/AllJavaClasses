package day23;

public class PracticeStringArray {
    public static void main(String[] args) {
        String [] whatever = new String [] {"hello", "short", "world", "longer", "longest"};

        String longestString = whatever[0];
        for (String s : whatever) {
            if(s.length()>longestString.length()){
               longestString = s;
            }
        }
        System.out.println(longestString);
    }
}
