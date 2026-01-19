
package Questions;

import java.util.Scanner;

public class NinthArray {
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
        int left=arr[0];
        int right=arr[size-1];
        arr[0]=right;
        arr[size-1]=left;
        System.out.print("Array elements after swapping: ");
        for(int i:arr) {
        	System.out.print(i+" ");
        }
        System.out.println();
        sc.close();
	}
}
