package Practice.Repls;

public class FiveLittleMonkeys_2 {
    public static void main(String[] args) {
        int monkey = 5;
        for (int i = monkey; i < 1; i--) {
            while(monkey%2==1){
                System.out.println(monkey + " little monkeys jumping on the bed " +
                        "\nOne fell off and bumped his head" +
                        "\nMama called the doctor" +
                        "\nAnd the doctor said" +
                        "\nNo more monkeys jumping on the bed");
                monkey--;
            } while (monkey%2==0){
                System.out.println(monkey + " little monkeys jumping on the bed " +
                        "\nOne fell off and bumped her head" +
                        "\nMama called the doctor" +
                        "\nAnd the doctor said" +
                        "\nNo more monkeys jumping on the bed");
                monkey--;
            }
        }
        System.out.println(monkey + " little monkey jumping on the bed" +
                "\nOne fell off and bumped his head" +
                "\nMama called the doctor" +
                "\nAnd the doctor said" +
                "\nPut those monkeys right to bed");
    }
}
