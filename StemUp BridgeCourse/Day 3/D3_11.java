import java.util.Scanner;
public class D3_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int no=sc.nextInt();
        boolean flag=true;
        
            for(int i=2;i<no;i++){
                if(no%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.println("Prime number: "+no);
            }else{
                System.out.println("not a prime: "+no);
            }
            }
    }

