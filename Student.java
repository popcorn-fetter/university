// Student.java

public class Student {
    private int studentID;
    private String name;

    public Student(int id, String studentName) {
        studentID = id;
        name = studentName;
    }

    public void display() {
        System.out.println("Student ID: " + studentID + ", Name: " + name);
    }
}
