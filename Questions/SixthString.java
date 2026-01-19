/**
 * 
 */
package Questions;

import java.util.Scanner;

public class SixthString {
	public static boolean checker(String str,boolean flag) {
		if(flag) {return true;}
		return false;
	}
	public static void execute() {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean flag=sc.nextBoolean();
		if(checker(str,flag)) {
			System.out.println(str.charAt(0));
		}else {
			System.out.println(str.charAt(str.length()-1));
		}
		sc.close();
	}
}