/**
 * 
 */
package Questions;

import java.util.Scanner;

/**
 * 
 */
public class EvenLength {
	public static boolean execute() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a, b and c below");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		if(a-b==b-c) {
			return true;
		}else {
			return false;
		}
	}
}
