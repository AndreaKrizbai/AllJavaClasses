package day07;

public class CastingTheCharacter {
    public static void main(String[] args) {

        char grade = 'B';
        System.out.println(grade);

        int letterInNumber = 'B';
        System.out.println(letterInNumber);

        int letterInNumber2 = 'b';
        System.out.println(letterInNumber2);

        char myFirstChar = 65;

        int name1 = 'A', name2 = 'n', name3 = 'd', name4 = 'r', name5 = 'e',
                name6 = 'a';

        System.out.println(name1 + "\t" + name2 + "\t" + name3 + "\t"
        + name4 + "\t" + name5 + "\t" + name6);

        System.out.println((int)('A'));
        System.out.println((int)('n'));
        System.out.println((int)('d'));
        System.out.println((int)('r'));
        System.out.println((int)('e'));
        System.out.println((int)('a'));



        char letterA = 'a';
        char letterB = 'b';
        System.out.println(letterA + 1);
        System.out.println("" + letterA + 1);
        System.out.println(""+letterA+letterB);
        System.out.println(letterA+letterB);
    }
}
