public class program16 {
    public static void main(String[] args) {
        
        boolean result = 5 + 3 * 2 > 10 && !(7 == 7);

        System.out.println("Result of the expression 5 + 3 * 2 > 10 && !(7 == 7): " + result);
    }
}

 

//  3 * 2           6     
//  5 + 6           11     
//  7 == 7          true   [equals operator]
//  !true           false  [not operator]
//  11 > 10         true   
//  true && false   false  [and operator]
