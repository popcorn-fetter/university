// Main.java

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");

        // Create courses
        Course course1 = new Course("CS101", "Introduction to Computer Science");
        Course course2 = new Course("MATH202", "Linear Algebra");

        // Create the university system
        UniversitySystem universitySystem = new UniversitySystem();

        // Add students and courses to the university system
        universitySystem.addStudent(student1);
        universitySystem.addStudent(student2);
        universitySystem.addCourse(course1);
        universitySystem.addCourse(course2);

        // Enroll students in courses
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student1);

        // Display information about the university system
        universitySystem.displayStudents();
        universitySystem.displayCourses();
    }
}
