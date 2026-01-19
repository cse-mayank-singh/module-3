package Questions;
import java.util.Scanner;
public class FirstMiddleLast {
	public static void execution() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int digit=sc.nextInt();
		int data=digit;
		sc.nextLine();
		int size=StrictlyIncreasing.digitSize(digit);
		int[] arr = new int[size];
        int i = 0;
        while (data != 0) {
            arr[i++] = data % 10;
            data /= 10;
        }
        System.out.println("First digit is: "+arr[size-1]);
        if(size%2!=0) {System.out.println("Middle digit is: "+arr[size/2]);}
        if(size%2==0) {System.out.println("Middle digits are: "+arr[size/2]+" "+arr[size/2+1]);}
        System.out.println("Last digit is: "+arr[0]);
		sc.close();
	}
}
