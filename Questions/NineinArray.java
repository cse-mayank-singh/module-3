package Questions;
import java.util.Scanner;
public class NineinArray {
	public static void execution() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size=sc.nextInt();
		sc.nextLine();
		int[] arr = new int[size];
		System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++) {
        	int temp=sc.nextInt();
        	arr[i]=temp;
        }
        boolean flag=false;
        if(arr[size-1]==9||arr[0]==9) {flag=true;}
		if(flag) {System.out.println("9 exists");}
		else {System.out.println("9 dosent exists");}
		sc.close();
	}
}
