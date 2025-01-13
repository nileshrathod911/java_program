   class bankingSystemNestedClasss {

    private double balance;

    bankingSystemNestedClasss(double initialbalance){
        this.balance=initialbalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount<=0){
            System.out.println("Please Enter positive amount");
        }else {
            Transaction transaction = new Transaction("Deposit ", amount);
        }
    }

    public void withdraw(double wAmount){
        if (wAmount>balance || wAmount<=0){
            System.out.println("Insufficient funds!");
        }else {
            balance=balance-wAmount;
            Transaction transaction=new Transaction("Withdraw ",wAmount);
        }
    }

    private class Transaction{
        private String type;
        private double amount;

        Transaction(String type,double amount){
            this.type=type;
            this.amount=amount;
        }
        public void logTransaction(){
            System.out.println(type + " $ " +amount);
        }
    }

       public static void main(String[] args) {
           bankingSystemNestedClasss bank=new bankingSystemNestedClasss(1000);
           bank.deposit(200);
           bank.withdraw(150);
           bank.withdraw(1200);
           System.out.println(bank.getBalance() );
       }

}
