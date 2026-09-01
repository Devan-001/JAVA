class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Name: " + this.name);
    }
}

class Student extends Person {
    private String course;

    public Student(String name, String course) {
        super(name); // Call parent constructor
        this.course = course;
    }

    public void displayStudentDetails() {
        super.displayName(); // Access parent method using super
        System.out.println("Course: " + this.course);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alex", "Computer Science");
        student.displayStudentDetails();
    }
}