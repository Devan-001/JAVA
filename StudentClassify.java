class Student{
    protected int rollNo;
    protected String name;
    protected int marks;

    Student(int rollNo,String name,int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    void displayStudent(){
        System.out.println("Student Details");
        System.out.println("-----------------");
        System.out.println("Roll number " + rollNo);
        System.out.println("Name "+ name);
        System.out.println("Marks " + marks );
    }
}
class PGStudent extends Student{
    String specialization;
    int semester;

    PGStudent(int rollNo,String name,int marks,String specialization,int semester){
        super(rollNo,name,marks);
        this.specialization = specialization;
        this.semester = semester;
    }
    void displayPGStudent(){
        displayStudent();

        System.out.println(" PG Student Details");
        System.out.println("-----------------");
        System.out.println("Specialization " + specialization);
        System.out.println("Semester "+ semester);

    }
}
public class StudentClassify {
    public static void main(String[] args){
        PGStudent s = new PGStudent(21,"Neha",89,"AI & ML",2);
        s.displayPGStudent();
    }
}