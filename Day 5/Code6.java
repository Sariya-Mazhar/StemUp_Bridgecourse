public class Code6 {
    String name;
    String breed;
    int age;

    Code6(String n, String b, int a) {
        name = n;
        breed = b;
        age = a;
    }

    void bark() {
        System.out.println(name + " says: Woof woof!");
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Code6 dog1 = new Code6("Buddy", "Golden Retriever", 5);
        Code6 dog2 = new Code6("Lucy", "Poodle", 2);

        dog1.bark();
        dog1.displayInfo();

        dog2.bark();
        dog2.displayInfo();
    }
}
