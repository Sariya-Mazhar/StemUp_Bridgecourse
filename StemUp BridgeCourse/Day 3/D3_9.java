public class D3_9 {
     
    public class Prob23 {
        public static void main(String[] args) {
        String str = "appleaIphonemax";
        int totalcount= str .length();
             int removea = str .replace("a","").length();
             int count=totalcount-removea;
            System.out.println(count);
        }
    }
}
