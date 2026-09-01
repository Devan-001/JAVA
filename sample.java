import java.util.Scanner;      // Imports the Scanner class for user input

public class sample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // Creates a Scanner object

        System.out.println("Enter your name");
        String name = sc.nextLine();           // Reads the name

        System.out.println("Enter the roll number");
        int Roll_num = sc.nextInt();           // Reads the roll number

        sc.nextLine();                         // Clears the Enter key from the input buffer

        System.out.println("Enter the Course name");
        String course = sc.nextLine();         // Reads the course name

        System.out.println("Enter the Percentage");
        double percentage = sc.nextDouble();   // Reads the percentage

        System.out.println("Student details");
        System.out.println("----------------");

        System.out.println("Name : " + name);
        System.out.println("Roll No : " + Roll_num);
        System.out.println("Course : " + course);
        System.out.println("Percentage : " + percentage);

        sc.close();                            // Closes the Scanner
    }
}