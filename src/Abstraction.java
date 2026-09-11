interface Payment {
    void makePayment();
}
class UPI implements  Payment{
    @Override //annotation to compiler that this method should be over written
    public void makePayment(){
        System.out.println("Payment using UPI");
    }
}
class CreditCard implements  Payment{
    @Override 
    public void makePayment(){
        System.out.println("Payment using credit card");
    }

}
public class Abstraction {
    public static void main(String[] args) {
        
    }
}
