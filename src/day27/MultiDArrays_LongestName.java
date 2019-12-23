package day27;

public class MultiDArrays_LongestName {
    public static void main(String[] args) {

        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testerTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalystsTeam = {"Lisa", "Ershad", "Naila"};

        String[][] scrumTeam = {developersTeam, testerTeam, businessAnalystsTeam};

        int maxLength = scrumTeam[0][0].length();
        String longestString = "";

        for(String[] each1DArray : scrumTeam){
            for(String eachElement : each1DArray){
                if(maxLength < eachElement.length()){
                    maxLength = eachElement.length();
                    longestString = eachElement;
                }
            }
        }
        System.out.println("maxLength = " + maxLength);
        System.out.println(longestString);


        for(String[] each1DArray : scrumTeam){
            for(String eachElement : each1DArray){
                if(maxLength == eachElement.length()){
                    System.out.println("Longest name: " + eachElement);
                }
            }
        }

    }
}
