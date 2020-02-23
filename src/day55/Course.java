package day55;

import java.util.List;

public class Course {
    String subject;
    List<String> studentNames; // String[] studentNames; - this will work but fixed in size

    public Course(String subject, List<String> studentNames) {
        this.subject = subject;
        this.studentNames = studentNames;
    }

    public void addStudent(String studentName){
        studentNames.add(studentName);
    }

    public void addManyStudents(List<String>many){
        studentNames.addAll(many);
    }
    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", studentNames=" + studentNames +
                '}';
    }
}
