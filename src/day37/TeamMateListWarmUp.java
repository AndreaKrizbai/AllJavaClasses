package day37;

import java.util.ArrayList;
/*
Warm up:
Create Arraylist of String and store
teamMates
print one by one
print reverse
print first last
print 2 at a time
concat everyone in one string separated by -
 */
public class TeamMateListWarmUp {
    public static void main(String[] args) {

        ArrayList<String> teamMates = new ArrayList<>();
        teamMates.add("Nodira");
        teamMates.add("Nursultan");
        teamMates.add("Arzu");
        teamMates.add("Gulnar");
        teamMates.add("Kahren");
        teamMates.add("Sultan");
        teamMates.add("Tatsiana");
        teamMates.add("Andrea");
        teamMates.add("Hasibe");
        teamMates.add("Svetlana");
        teamMates.add("Timur");
        teamMates.add("Beibit");
        teamMates.add("Rabia");
        teamMates.add("Ghoya");
        teamMates.add("Layle");

        System.out.println(teamMates);

        System.out.println("First item : " + teamMates.get(0));
        System.out.println("Last item : " + teamMates.get(teamMates.size()-1));

        for (int i = 0; i < teamMates.size(); i++) {
            System.out.println("\t Item " + (i+1) + " : " + teamMates.get(i));
        }

        for (int i = teamMates.size()-1; i >= 0; i--) {
            System.out.println("Reversed item " + (i+1) + " : " + teamMates.get(i));
        }

        System.out.println("\nPrint 2 items at a time - ALL OF THEM: ");
        for (int x = 0; x < teamMates.size()-1; x++) {
            System.out.println("\t" + teamMates.get(x) + " --- " + teamMates.get(x+1));
        }

        System.out.println("\nPrint 2 items at a time - WITHOUT REPEATING: ");
        for (int x = 0; x < teamMates.size()-1; x+=2) {
            System.out.println("\t" + teamMates.get(x) + " --- " + teamMates.get(x+1));
        }
        if (teamMates.size() % 2 == 1) {
            System.out.println("\t" + teamMates.get(teamMates.size() - 1));
        }
        System.out.println("\nPrint 3 items at a time - WITHOUT REPEATING: ");
        for (int x = 0; x < teamMates.size()-2; x+=3) {
            System.out.println("\t" + teamMates.get(x) + " --- " + teamMates.get(x+1) + " --- " + teamMates.get(x+2));
        }

        String result = "";
        for (int i = 0; i < teamMates.size()-1; i++) {
            result = result + teamMates.get(i) + " - ";
        }
        result = result + teamMates.get(teamMates.size()-1);
        System.out.println(result);

        //TODO: How can we turn a List into a String and store it?
        String lstToString = teamMates.toString();
        System.out.println("lstToString after replacing = \n"
                + lstToString.replace(", ","-")
                             .replace("[","")
                             .replace("]",""));

    }
}
