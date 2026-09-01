class BankAccount {
    // 1. Private instance variables (unique to each account)
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // 2. Static variable (shared across ALL accounts)
    private static int accountCount = 0;

    // 3. Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        
        // Increment the shared tracker, then assign it as the unique ID
        accountCount++;
        this.accountNumber = accountCount;
    }

    // 4. Methods for bank operations
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true; // Withdrawal successful
        }
        return false; // Not enough money or invalid amount
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Transfers money and creates a Transaction record
    public Transaction transferTo(BankAccount target, double amount) {
        boolean success = this.withdraw(amount);
        String status;
        
        if (success) {
            target.deposit(amount);
            status = "Success";
        } else {
            status = "Failed";
        }
        
        // Returns a brand new Transaction object
        return new Transaction(this.accountNumber, target.accountNumber, amount, status);
    }

    // Helper method to easily print account details
    public void displayAccountInfo() {
        System.out.println("A/C No: " + accountNumber + " | Holder: " + accountHolder + " | Balance: Rs." + balance);
    }
}

class Transaction {
    // 1. Private instance variables
    private int fromAccount;
    private int toAccount;
    private double amount;
    private String status;

    // 2. Constructor
    public Transaction(int fromAccount, int toAccount, double amount, String status) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.status = status;
    }

    // 3. Display method
    public void displayTransaction() {
        System.out.println("Transaction -> [From A/C: " + fromAccount + " to A/C: " + toAccount + 
                           "] Amount: Rs." + amount + " | Status: " + status);
    }
}

// The main application class
public class BankApp {
    public static void main(String[] args) {
        // 1. Create two BankAccount objects
        BankAccount acc1 = new BankAccount("Alice", 1000.0);
        BankAccount acc2 = new BankAccount("Bob", 500.0);

        System.out.println("--- Initial Account States ---");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();

        // 2. Perform a SUCCESSFUL transfer (Alice sends Rs.200 to Bob)
        System.out.println("\n--- Attempting Transfer 1 ---");
        Transaction t1 = acc1.transferTo(acc2, 200.0);
        t1.displayTransaction(); // Display the transaction receipt

        // 3. Perform a FAILED transfer (Alice tries to send Rs.5000 to Bob)
        System.out.println("\n--- Attempting Transfer 2 ---");
        Transaction t2 = acc1.transferTo(acc2, 5000.0);
        t2.displayTransaction(); // Display the failed receipt

        // 4. Display final account details to verify balances
        System.out.println("\n--- Final Account States ---");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
    }
}