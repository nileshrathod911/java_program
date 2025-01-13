package challeng54;

import java.util.HashMap;

public class Account {
    private final String accountHolderName;
    private final String accountHolderId;
    private double balance;

    Account(String accountHolderId,String accountHolderName,double balance){
        this.accountHolderName=accountHolderName;
        this.accountHolderId=accountHolderId;
        this.balance=balance;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }
    public String getAccountHolderId(){
        return accountHolderId;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount)throws IllegalArgumentException{
        if (amount<0){
            throw new IllegalArgumentException("Deposit amount must be grater than Zero.");
        }
        balance=balance+amount;
    }
    public  void withdrawal(double amount)throws IllegalArgumentException,InsufficientFundsException{
        if (amount<0){
           throw new IllegalArgumentException("withdrawal amount must be grater then zero.");
        }
        if (amount>balance) {
            throw new InsufficientFundsException("Insufficient funds in account.");
        }
        balance=balance-amount;
    }
}

class InsufficientFundsException extends Exception{
    InsufficientFundsException(String message){
        super(message);
    }
}

class BankApplication {
    private final HashMap<String,Account>account=new HashMap<>();

    public void createAccount(String accountId,String accountHolderName,double balance){
        if (accountId==null || accountId.isEmpty()){
            throw new IllegalArgumentException("Account id cannot be null or empty.");
        }
        if (account.containsKey(accountId)){
            throw new IllegalArgumentException("Account with this id all Ready Exist.");
        }
        account.put(accountId,new Account(accountId,accountHolderName,balance));
    }

    public void transferFund(String fromAccountId,String toAccountId,double amount)throws IllegalArgumentException,InsufficientFundsException{
        if (fromAccountId==null || fromAccountId.isEmpty() || toAccountId==null || toAccountId.isEmpty()){
            throw new IllegalArgumentException("Account id cannot be null or empty.");
        }
        if (!account.containsKey(fromAccountId)){
            throw new IllegalArgumentException("From account does not exist.");
        }
        if (!account.containsKey(toAccountId)){
            throw new IllegalArgumentException("To account does not exist.");
        }
        if (amount<=0){
            throw new IllegalArgumentException("Transfer amount must be grater than Zero.");
        }
        Account fromAccount=account.get(fromAccountId);
        Account toAccount=account.get(toAccountId);

        synchronized (this){
            fromAccount.withdrawal(amount);
            toAccount.deposit(amount);
        }
    }
    public void displayAccountDetails(String accountID){
        if (!account.containsKey(accountID)){
            throw new IllegalArgumentException("Account Not found!");
        }
        Account account1=account.get(accountID);
        System.out.println("Account Id: "+account1.getAccountHolderId());
        System.out.println("Account HolderName: "+account1.getAccountHolderName());
        System.out.println("Account Balance: "+account1.getBalance());
    }

}

