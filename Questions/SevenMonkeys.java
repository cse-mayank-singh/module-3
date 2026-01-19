
package Questions;
import java.util.Scanner;
public class SevenMonkeys {
	public static boolean checker(boolean asmile,boolean bsmile) {
		if(asmile==true&&bsmile==true||asmile==false&&bsmile==false) {return true;}
		return false;
	}
	public static void execute() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter asmile and bsmile");
		boolean asmile=sc.nextBoolean();
		boolean bsmile=sc.nextBoolean();
		if(checker(asmile,bsmile)) {System.out.println("true, you are in trouble");}
		else {System.out.println("false, you are not in trouble");}
		sc.close();
	}
}
