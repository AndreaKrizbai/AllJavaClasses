package day26;

public class ToCharArrayPractice {
    public static void main(String[] args) {

        String survey = "Complete B15 Online 1 Month Survey";
        char[] surveyChars = survey.toCharArray();

        System.out.println("-----FOR EACH LOOP-----");
        for(char each : surveyChars){
            System.out.println("each char is: " + each);
        }
        System.out.println(" ----- WHILE LOOP -----");
        int x = 0;
        while(x<surveyChars.length){
            System.out.println("Index is " + x + " and char is " + surveyChars[x]);
            x++;
        }
        System.out.println("------ FOR LOOP -----");
        for (int i = 0; i < surveyChars.length; i++) {
            System.out.println("Index is " + i + " , char is " + surveyChars[i]);
        }

        System.out.println("-----DO WHILE LOOP-----");
        int y = 0;
        do{
            System.out.println("Index is " + y + " and char is " + surveyChars[y]);
            y++;
        } while (y<surveyChars.length);
    }
}
