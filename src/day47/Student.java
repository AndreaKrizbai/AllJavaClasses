package day47;

public class Student {

    //final INSTANCE FIELD
  //final int studentID;
    //with that above we couldn't change from 101 to 200
    // with that not even address, but value cannot be reassigned either
    int studentID;
    //public final static field with initial value set
    public static final String SCHOOL = "Cybertek";


    public Student(int studentID){
        this.studentID = studentID;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "studentID=" + studentID +
//                '}';
//    }
}
