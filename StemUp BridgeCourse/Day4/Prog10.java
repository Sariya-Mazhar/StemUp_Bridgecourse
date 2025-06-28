public class Prog10 {

    
    public static void customGreet(String name, String greeting) { //2 params
        System.out.println(greeting + ", " + name + "!");
    }

    public static void customGreet(String name) { //single param
        System.out.println("Hello, " + name + "!");
    }

    public static void customGreet() { //no param
        System.out.println("Hello, Guest!");
    }

    public static void main(String[] args) {
      
        customGreet("Virat", "Good Morning"); 
        customGreet("Virat");                  
        customGreet();                         
    }
}

