// UniversitySystem.java

import java.util.ArrayList;
import java.util.List;

public class UniversitySystem {
    private List<Student> students;
    private List<Course> courses;

    public UniversitySystem() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayStudents() {
        System.out.println("All Students in the University:");
        for (Student student : students) {
            student.display();
        }
    }

    public void displayCourses() {
        System.out.println("All Courses in the University:");
        for (Course course : courses) {
            course.display();
        }
    }
}
