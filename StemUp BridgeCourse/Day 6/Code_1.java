class Smartphone {
    private String brand;
    private String model;
    private int batteryLevel;

    public Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.batteryLevel = 50; // default battery level
    }

    public void turnOn() {
        if (batteryLevel > 0) {
            System.out.println(model + " is now ON.");
        } else {
            System.out.println("Battery dead. Please charge first.");
        }
    }

    public void turnOff() {
        System.out.println(model + " is now OFF.");
    }

    public void charge() {
        batteryLevel = 100;
        System.out.println("Charging... Battery is now full.");
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}

public class Code_1{
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung", "Galaxy A51");

        phone.turnOn();
        System.out.println("Battery Level: " + phone.getBatteryLevel() + "%");

        phone.charge();
        System.out.println("Battery Level after charging: " + phone.getBatteryLevel() + "%");

        phone.turnOff();
    }
}
