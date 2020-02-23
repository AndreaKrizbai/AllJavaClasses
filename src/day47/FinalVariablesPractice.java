package day47;

public class FinalVariablesPractice {
    public static void main(String[] args) {

//declaring and initializing a variable, assigning initial value
        int x = 10;
// reassigning new value to the variable, storing/giving a new value to the variable, changing the original value of the variable
        x = 100;
//declaring and initializing a final variable, assigning initial value to a final variable
        final int a = 20;
       // a = 2; cannot do it --> ERROR!!

        final Student s1 = new Student(101);
        System.out.println(s1.studentID);
        System.out.println(s1);
        // s1 = new Student(102);
        // cannot reassign the value because it's final
        System.out.println(s1.studentID=200);
        System.out.println(s1);

        System.out.println(Student.SCHOOL);
        //cannot reassign value because it's final
       // Student.school = "abc";

        System.out.println(Byte.MAX_VALUE);

        System.out.println(Math.PI);
        printDoubledNumber(12);
    }

    public static void printDoubledNumber(final int x){
//doesn't work with final keyword but would work without it
//       x = x * 2;
//        System.out.println(" x * 2 = " + x);

        System.out.println(" x * 2 = " + x*2);
    }
}
