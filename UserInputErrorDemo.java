// import java.util.InputMismatchException;
import java.util.Scanner;
public class UserInputErrorDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age;

        while(true){
            System.out.print("Enter the age: ");
            if (input.hasNextInt()){
                age = input.nextInt();
                break;
            }else{
                System.out.println("Error");
                input.next();
            }
        }
        System.out.println("Your age is:"+age);
        input.close();
    }
}