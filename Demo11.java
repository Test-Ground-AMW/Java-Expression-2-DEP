public class Demo11 {
    public static void main(String[] args) {

        int x = 5, a = 5, c = 5;
        int y = 2, b = 2, d = 2;

        int result0 = ++x + ++y+x+++y;    
        int result1 = ++a + ++b + a++ + b; 
        int result2 = ++c + ++d + c + ++d;

        System.out.println(result0);  // prints 18 
        System.out.println(result1);  // prints 18 // compiler tokenize the code according to this order  
        System.out.println(result2);  // prints 19 
    }
}
