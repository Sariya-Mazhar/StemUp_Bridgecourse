import java.util.ArrayList;

class Customer {
    // Attributes
    String name;
    int id;

    // Constructor
    Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Customer: " + name + ", ID: " + id);
    }
}

class CustomerManager {
    // List to store Customer objects
    ArrayList<Customer> customerList = new ArrayList<>();

    // Behavior to add a customer
    void addCustomer(String name, int id) {
        customerList.add(new Customer(name, id));
        System.out.println("Customer added: " + name + ", ID: " + id);
    }

    // Behavior to delete a customer
    void deleteCustomer(int id) {
        for (Customer c : customerList) {
            if (c.id == id) {
                customerList.remove(c);
                System.out.println("Customer deleted: ID " + id);
                return;
            }
        }
        System.out.println("Customer with ID " + id + " not found.");
    }

    void showAllCustomers() {
        for (Customer c : customerList) {
            c.display();
        }
    }

    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager();
        manager.addCustomer("Alice", 101);
        manager.addCustomer("Bob", 102);
        manager.showAllCustomers();
        manager.deleteCustomer(101);
        manager.showAllCustomers();
    }
}

