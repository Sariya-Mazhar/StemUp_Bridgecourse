public class Code5 {
    String model_name;
    int cost;
    String type;
    String color;

    Code5(String a, int b, String c, String d){
        model_name=a;
        cost=b;
        type=c;
        color=d;

    }
    public void start(){
        System.out.println("My "+model_name+" starts with tremendous exhaust");
    }
    public void Speed(){
        System.out.println("My car runs on "+type);
    }
    public void Outlook(){
        System.out.println("My car has fancy deep "+color+ " color");
    }
    public void Price(){
        System.out.println("My car "+model_name+"costs "+cost);
    }
    public static void main(String[] args) {
        Code5 c1=new Code5("Lamborghini",30000000,"Diesel","Black");
        c1.start();
        c1.Speed();
        c1.Outlook();
        c1.Price();
        }
}
