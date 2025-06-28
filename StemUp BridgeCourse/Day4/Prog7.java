public class Prog7 {
    static String globalMessage = "I am global!";
    static void displayMessages() {
        String localMessage = "I am local!";
        System.out.println(globalMessage);     //  global variable is valid
        System.out.println(localMessage);      //  local variable is valid
    }
    public static void main(String[] args) {
        displayMessages();
        //System.out.println(localMessage);
    } 
}