package Questions;
import java.util.Scanner;
public class TenthDriving {
	public static void specialChecker(int speed) {
		int noTicket=0;
		int smallTicket=1;
		int bigTicket=2;
		if(speed<65) {
			System.out.println("Noticket encoded as " + noTicket);
		}
		else if(speed>=65&&speed<=85) {
			System.out.println("small ticket encoded as " + smallTicket);
		}
		else {
			System.out.println("bigticket encoded as " + bigTicket);
		}
	}
	public static void Checker(int speed) {
		int noTicket=0;
		int smallTicket=1;
		int bigTicket=2;
		if(speed<60) {
			System.out.println("Noticket encoded as " + noTicket);
		}
		else if(speed>=60&&speed<=80) {
			System.out.println("small ticket encoded as " + smallTicket);
		}
		else {
			System.out.println("bigticket encoded as " + bigTicket);
		}
	}
	public static void execution() {
		System.out.println("Enter Speed: ");
		Scanner sc=new Scanner(System.in);
		int speed=sc.nextInt();
		System.out.println("Enter Bday for true else false: ");
		boolean bday=sc.nextBoolean();
		if(bday) {
			specialChecker(speed);
		}else {
			Checker(speed);
		}
		sc.close();
	}
}
