package challeng54;

import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        BankApplication bankApplication=new BankApplication();

        try (Scanner sc = new Scanner(System.in)) {
            bankApplication.createAccount("1234", "Nilesh", 5000);
            bankApplication.createAccount("6789", "Kavita", 2000);

            System.out.print("Enter sender Account Id: ");
            String fromAccount = sc.nextLine();

            System.out.print("Enter receiver Account Id: ");
            String toAccount = sc.nextLine();

            System.out.println("Enter amount To transfer");
            double amount = sc.nextDouble();

            try {
                bankApplication.transferFund(fromAccount, toAccount, amount);
                System.out.println("Transfer Successfully.");
            } catch (InsufficientFundsException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("Enter accountId to display Details: ");
            sc.nextLine();
            String accountId = sc.nextLine();

            try {
                bankApplication.displayAccountDetails(accountId);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Application Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An Unexpected Error occurred: " + e.getMessage());
        } finally {
            System.out.println("Banking application terminated.");
        }
    }
}
