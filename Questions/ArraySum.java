package Questions;
import java.util.Scanner;
public class ArraySum {
	public static void ArrayPrinter(int[] arr) {
		System.out.println("Array elements:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void execute() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array 1 size: ");
		int size1=sc.nextInt();
		System.out.println("Enter Array 2 size: ");
		int size2=sc.nextInt();
		int[] arr1=new int[size1];
		int[] arr2=new int[size2];
		System.out.println("Enter Array 1 elements: ");
		for(int i=0;i<size1;i++) {
			int temp=sc.nextInt();
			arr1[i]=temp;
		}
		System.out.println("Enter Array 2 elements: ");
		for(int i=0;i<size2;i++) {
			int temp=sc.nextInt();
			arr2[i]=temp;
		}
		int sum1=0;
		int sum2=0;
		for(int i=0;i<size1;i++) {
			sum1+=arr1[i];
		}
		for(int i=0;i<size2;i++) {
			sum2+=arr2[i];
		}
		if(sum1>sum2) {
			ArrayPrinter(arr1);
		}else if(sum2>sum1) {
			ArrayPrinter(arr2);
		}else {
			ArrayPrinter(arr1);
		}
		sc.close();
	}
}
