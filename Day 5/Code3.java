public class Code3{
    static String species = "Canis familiaris";
    static int numLegs = 4;

    String name;
    String breed;
    int age;
    public Code3(String n, String b, int a) {
        n = name;
        b = breed;
        a = age;
    }

    public void bark() {
        System.out.println("My "+name+"barks woof!!! at the age "+age);
    }

    
    public static void main(String[] args) {
        Code3 myDog = new Code3("Thor", "Greatdane", 2);
        System.out.println("Name: " + myDog.name);
        System.out.println("Breed: " + myDog.breed);
        System.out.println("Age: " + myDog.age);
        System.out.println("Species: " + Code3.species);
        System.out.println("Number of Legs: " + Code3.numLegs);
        myDog.bark();
    }
}

