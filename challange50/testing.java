package challange50;

public class testing {
    public static void main(String[] args) {
        CreditCardPayment creditCard=new CreditCardPayment("12345","112233",5000);
        creditCard.complatePayment();
        creditCard.printReceipt();
       
    }
}
