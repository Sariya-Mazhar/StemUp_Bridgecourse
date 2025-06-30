public class Code9 {
    // Instance attribute
    private double balance;

    // Constructor
    public Code9(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance can't be negative. Setting to 0.");
            this.balance = 0;
        }
    }

    // Method to get current balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        Code9 account = new Code9(1000.0);

        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500.0);       // Valid
        account.deposit(-100.0);      // Invalid

        account.withdraw(200.0);      // Valid
        account.withdraw(2000.0);     // Invalid (excessive)
        account.withdraw(-50.0);      // Invalid

        System.out.println("Final Balance: " + account.getBalance());
    }
}


