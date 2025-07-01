abstract class Payment{
    abstract void processPayment(double amount);
}
class CreditCard extends Payment {
    void processPayment(double amount) {
        System.out.println("My Credit Card has: ₹" + amount);
    }
}
class Phonepe extends Payment{
    void processPayment(double amount) {
        System.out.println("My Phonepe balance is: ₹" + amount);
    }
}
public class Code_6 {
    public static void main(String[] args) {
        Payment a = new CreditCard();
        Payment b = new Phonepe();
        a.processPayment(350000);
        b.processPayment(229000);
        
    }
}
