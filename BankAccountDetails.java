class BankAccount{
    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
}
class SavingsAccount extends BankAccount{
    double interestRate;

    SavingsAccount(int accountNumber,double balance,double interestRate){
        super(accountNumber,balance);

        this.interestRate = interestRate;
    }
    void displayDetails(){
        System.out.println("Account Details");
        System.out.println("-----------------");
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Balance: "+ getBalance());

        System.out.println("");

        System.out.println("Interest Rate : "+ interestRate + "%");

        double interest = getBalance() * interestRate / 100 ;

        System.out.println("Interest Earned: "+interest);
    }
}
public class BankAccountDetails{
    public static void main(String[] args){
        SavingsAccount s = new SavingsAccount(100245,50000,5);
        s.displayDetails();
    }
}