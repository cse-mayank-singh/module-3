/**
 * 
 */
package Questions;

import java.util.Scanner;

/**
 * 
 */
public class SameNumbers {
	public static void greenLottery(int a,int b,int c) {
		if(a==b&&a==c) {
			System.out.println(20);
		}
		else if(a!=b&&a!=c) {
			System.out.println(0);
		}else {
			System.out.println(10);
		}
	}
	public static void blueLottery(int a,int b,int c) {
		int AB=a+b;
		int BC=b+c;
		int AC=c+a;
		if(AB==10||BC==10||AC==10) {
			System.out.println(10);
		}
		else if(AB==BC+10||AB==AC+10) {
			System.out.println(5);
		}else {
			System.out.println(0);
		}
	}
	public static void execute() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a, b and c below");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Green Lottery");
		greenLottery(a,b,c);
		System.out.println("===============================");
		System.out.println("Blue Lottery");
//		blueLottery(a,b,c);
		sc.close();
	}
}
