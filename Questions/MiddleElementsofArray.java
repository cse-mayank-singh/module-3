
package Questions;
import java.util.Scanner;
public class MiddleElementsofArray {
	public static void execute() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array 1 even size: ");
		int size1=sc.nextInt();
		int[] arr1=new int[size1];
		int[] arr2=new int[2];
		System.out.println("Enter Array 1 elements: ");
		for(int i=0;i<size1;i++) {
			int temp=sc.nextInt();
			arr1[i]=temp;
		}
		sc.close();
		arr2[0]=arr1[size1/2];
		arr2[1]=arr1[(size1/2)-1];
		ArraySum.ArrayPrinter(arr2);
	}
}