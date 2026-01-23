/**
 * 
 */
package ExceptionHandeling;

/**
 * 
 */
public class Finally{
    public static void exec(){
        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // Exception here
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero");

        } finally {
            System.out.println("Finally block executed");  //Stuff that MUST happen, no matter what.
        }
    }
}    
