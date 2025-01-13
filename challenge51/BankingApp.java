package challenge51;

// Base class for an Account
class Account {
    String accountHolderName;
    double balance;

    // Constructor
    public Account(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to deposit money (Method Overloading)
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Overloaded method to deposit with a description
    public void deposit(double amount, String description) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Description: " + description);
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

// Derived class for SavingsAccount
class SavingsAccount extends Account {
    double interestRate;

    // Constructor
    public SavingsAccount(String accountHolderName, double balance, double interestRate) {
        super(accountHolderName, balance); // Using the super keyword to call the parent class constructor
        this.interestRate = interestRate;
    }

    // Method to display account details (overriding parent method)
    @Override
    public void displayDetails() {
        super.displayDetails(); // Using super to call the parent class's displayDetails method
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class
public class BankingApp {
    public static void main(String[] args) {
        // Creating objects
        Account account1 = new Account("Alice", 5000);
        SavingsAccount savingsAccount = new SavingsAccount("Bob", 10000, 3.5);

        // Demonstrating method overloading
        account1.deposit(2000); // Using single-parameter deposit
        account1.deposit(1500, "Monthly savings"); // Using overloaded deposit

        // Demonstrating super keyword and method overriding
        System.out.println("\nDetails of Savings Account:");
        savingsAccount.displayDetails();

        // Demonstrating object typecasting
        Account account2 = new SavingsAccount("Charlie", 8000, 2.5); // Upcasting
        System.out.println("\nUpcasted Account Details:");
        account2.displayDetails(); // Polymorphism: Calls SavingsAccount's displayDetails()

        if (account2 instanceof SavingsAccount) {
            SavingsAccount savings = (SavingsAccount) account2; // Downcasting
            System.out.println("\nDowncasted Savings Account Interest Rate: " + savings.interestRate);
        }
    }
}

