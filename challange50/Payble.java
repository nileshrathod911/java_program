package challange50;

public interface Payble { ;
    void initalPayment();
    void complatePayment();
    void cancelPayment();
}
abstract class Payment implements Payble{
    private String transactionId;
    private Double amount;

    Payment(String transactionId,double amount){
        this.transactionId=transactionId;
    }
    public String getTransactionId(){
        return transactionId;
    }
    public double getAmount(){
        return amount;
    }


    public void printReceipt(){
        System.out.println("TransactionID : "+getTransactionId());
        System.out.println("Amount : "+getAmount());
        System.out.println("Thank you for Payment.");
    }
}
class CreditCardPayment extends Payment{
    private String cardNumber;
    private double amount;
    CreditCardPayment(String cardNumber,String transctionId,double amount){
        super(transctionId,amount);
        this.cardNumber=cardNumber;
    }
    public String getCardNumber(){
        return cardNumber;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void initalPayment() {
        System.out.println("Processing CreditCard Amount : "+getAmount());
    }

    @Override
    public void complatePayment() {
        System.out.println("Credit card Payment complete SuccessFully. ");
    }

    @Override
    public void cancelPayment() {
        System.out.println("Credit card Payment Cancel.");
    }
}
class PaypalPayment extends Payment{
    private String emailId;
    PaypalPayment(String emailId,double amount,String transactionID){
        super(transactionID, amount);
        this.emailId=emailId;
    }
    public String getEmailId(){
        return emailId;
    }

    @Override
    public void initalPayment() {
        System.out.println(" processing Paypal amount : "+getAmount());
    }

    @Override
    public void complatePayment() {
        System.out.println("Paypal Payment complete Successfully. "+getTransactionId());
    }
    @Override
    public void cancelPayment() {
        System.out.println("Paypal Payment Cancel.");
    }
}
