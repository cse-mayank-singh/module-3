/**
 * 
 */
package ExceptionHandeling;
import java.util.Scanner;
/**
 * 
 */
public class InvalidINPUT {
    public static void exec() {
    	Scanner SC=new Scanner(System.in);
        try {
            byte b=SC.nextByte();
            System.out.println(b);
        }
        catch (Throwable e) {
            System.out.println("Invalid Input!");
        }
        System.out.println("Program continues...");
        SC.close();
    }
}