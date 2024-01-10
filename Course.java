// Course.java

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String code, String name) {
        courseCode = code;
        courseName = name;
        enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void display() {
        System.out.println("Course Code: " + courseCode + ", Course Name: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            student.display();
        }
    }
}
