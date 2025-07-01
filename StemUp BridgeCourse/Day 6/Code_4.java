class Animal {
    void makeSound() {
        System.out.println("The animals makes plenty of sound.");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog says boww boww.");
    }
}
class Horse extends Animal {
    void makeSound() {
        System.out.println("The horse neighhssss neighsss.");
    }
}
public class Code_4 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        Animal c = new Horse();

        a.makeSound(); 
        b.makeSound();    
        c.makeSound();    
    }
}
