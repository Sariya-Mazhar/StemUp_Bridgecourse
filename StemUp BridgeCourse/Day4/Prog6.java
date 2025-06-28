public class Prog6 {
    static double celsiusToFahrenheit(double c){
        
       double Fahrenheit=(c*1.8)+32;//F = (°C × 1.8) + 32
       return Fahrenheit;
    }
    static double fahrenheitToCelsius(double F){
        
        double Celsius=(F - 32) / 1.8;//C = (°F - 32) / 1.8
        return Celsius;

    }
    public static void main(String[]args){
        double a=celsiusToFahrenheit(0);
        double b=fahrenheitToCelsius(0.3);
        System.out.println("The Fahrenheit is "+a);
         System.out.println("The Celsius is "+b);
    }
}
