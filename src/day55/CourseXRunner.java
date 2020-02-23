package day55;

import java.util.ArrayList;
import java.util.List;

public class CourseXRunner {
    public static void main(String[] args) {

    List<Student> myLst = new ArrayList<>();
    myLst.add(new Student("Muge",101));
    myLst.add(new Student("Hasan",102));

    CourseX java = new CourseX("HAS-A",myLst);
        System.out.println("java = " + java);
        java.addStudent("Goksel",110);
        java.addStudent(new Student("Dilshat",111));
        System.out.println("java = " + java);

    }
}
