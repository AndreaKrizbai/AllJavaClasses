package Practice.Repls;

public class FiveLittleMonkeys {
    public static void main(String[] args) {

        int monkeyCount = 5;

        while(monkeyCount > 1){
            System.out.println(monkeyCount + " little monkeys jumping on the bed " +
                            "\nOne fell off and bumped his head" +
                            "\nMama called the doctor" +
                            "\nAnd the doctor said" +
                            "\nNo more monkeys jumping on the bed");
            --monkeyCount;
        }
        System.out.println(monkeyCount + " little monkey jumping on the bed" +
                "\nOne fell off and bumped his head" +
                "\nMama called the doctor" +
                "\nAnd the doctor said" +
                "\nPut those monkeys right to bed");
    }
}
