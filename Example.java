import java.util.Scanner;
public class Example{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter the principal amount");
		int principal = sc.nextInt();


		System.out.println("Enter the interest rate");
		float interest = sc.nextFloat();

	
		System.out.println("Enter the duration time");
		int time = sc.nextInt();

		double simpleinterest = (principal * interest * time) / 100;

		double Finalamount = principal + simpleinterest ;

		System.out.println("Simple Interest = " +simpleinterest);

		System.out.println("Final Amount = " +Finalamount);

		sc.close();		



	}
}