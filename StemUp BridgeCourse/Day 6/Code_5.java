
class ElectronicDevice {
    void On() {
        System.out.println("Turn the TV ON");
    }
}
class Television extends ElectronicDevice {
    void changeChannel() {
        System.out.println("Changing TV channel");
    }
}
class Laptop extends ElectronicDevice {
    void runProgram() {
        System.out.println("Running a program on Laptop");
    }
}
class Smartphone extends ElectronicDevice {
    void makeCall() {
        System.out.println("Making a call from Smartphone");
    }
}
public class Code_5 {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.On();
        tv.changeChannel();

        Laptop laptop = new Laptop();
        laptop.On();
        laptop.runProgram();

        Smartphone phone = new Smartphone();
        phone.On();
        phone.makeCall();
    }
}
