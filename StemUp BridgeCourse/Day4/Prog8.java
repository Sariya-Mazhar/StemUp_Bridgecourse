public class Prog8{
    public static double calculateDiscount(double originalPrice, double discountPercentage) {
        return originalPrice * (discountPercentage / 100);
    }
    public static double calculateTax(double amount, double taxRate) {
        return amount * (taxRate / 100);
    }
    public static double calculateFinalPrice(double itemPrice, double discountPerc, double taxRate) {
        double discount = calculateDiscount(itemPrice, discountPerc);
        double priceAfterDiscount = itemPrice - discount;
        double tax = calculateTax(priceAfterDiscount, taxRate);
        return priceAfterDiscount + tax;
    }
    public static void main(String[] args) {
        
        double finalPrice = calculateFinalPrice(7690.0, 12.0, 8.0);
        System.out.println("Final Price: Rs " + finalPrice);
    }
}
