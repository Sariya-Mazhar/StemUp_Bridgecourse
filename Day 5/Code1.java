public class Code1 {
    String Television="Samsung";
    int Button=1;
    int Volume=23;


    public  void Television(){
        System.out.println("Welcome to "+Television+" Digiworld");
    }
    public void Button(){
        System.out.println("Changing channels using "+Button+" buttons...");
    }
    public void Volume(){
        System.out.println("Volume up... "+Volume+" ...Volume down");
    }
    public static void main(String[] args) {
        Code1 TV=new Code1();
        TV.Television();
        TV.Button();
        TV.Volume();
    }
}
// public class Code1 {
//     public  void Whatsapp(){
//         System.out.println("Welcome to Whatsapp");
//     }
//     public void Send(){
//         System.out.println("Sending a message..");
//     }
//     public void Call(){
//         System.out.println("Calling my friend....");
//     }
//     public static void main(String[] args) {
//         Code1 Wsp=new Code1();
//         Wsp.Whatsapp();
//         Wsp.Send();
//         Wsp.Call();
//     }
// }
// public class Code1 {
//     public  void Instagram(){
//         System.out.println("Welcome to Instagram");
//     }
//     public void Send(){
//         System.out.println("Sending a message..");
//     }
//     public void Call(){
//         System.out.println("Calling my friend....");
//     }
//     public static void main(String[] args) {
//         Code1 Wsp=new Code1();
//         Wsp.Instagram();
//         Wsp.Send();
//         Wsp.Call();
//     }
// }
