package Advance;
import java.util.Scanner;
public class ArraySorting {
	public static void exec() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter odd size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter array elements ");
		for(int i=0;i<size;i++) {
			int temp=sc.nextInt();
			arr[i]=temp;
		}
		int middle=arr[size/2];
		int[] arrfirst=new int[size/2];
		int[] arrsecond=new int[size/2];
		for(int i=0;i<size/2;i++) {
			arrfirst[i]=arr[i];
		}
		BubbleSort.exec(arrfirst);
		int j=0;
		for(int i=size/2+1;i<size;i++) {
			arrsecond[j]=arr[i];
			j++;
		}
		j=0;
		BubbleSort.execReverse(arrsecond);
		int[] arrfinal=new int[size];
		arrfinal[size/2]=middle;
		for(int i=0;i<size/2;i++) {
			arrfinal[i]=arrfirst[i];
		}
		for(int i=size/2+1;i<size;i++) {
			arrfinal[i]=arrsecond[j];
			j++;
		}
		BubbleSort.display(arrfinal);
		sc.close();
	}
}
