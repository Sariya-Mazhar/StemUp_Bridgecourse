public class Code10 {
    // Private instance variables
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Code10(String name, double price, int quantity) {
        this.name = name;
        setPrice(price);
        setQuantity(quantity);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for price with validation
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price. Must be positive.");
        }
    }

    // Setter for quantity with validation
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity. Cannot be negative.");
        }
    }

    // Method to calculate total value
    public double getTotalValue() {
        return price * quantity;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a product
       Code10 product = new Code10("Laptop", 45000.0, 5);

        // Print initial details
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Total Value: " + product.getTotalValue());

        // Try setting invalid values
        product.setPrice(-1000);     // Invalid
        product.setQuantity(-2);     // Invalid

        // Update with valid values
        product.setPrice(50000);
        product.setQuantity(3);

        // Print updated details
        System.out.println("\nUpdated Details:");
        System.out.println("Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("Total Value: " + product.getTotalValue());
    }
}
