package Questions;
import java.util.Scanner;
public class ArrayisPalindrome {
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
        int left=0;
        int right=size-1;
        boolean flag=true;
        while(left<right) {
        	if(arr[left]!=arr[right]) {
        		flag=false;
        		break;
        	}
        	left++;
        	right--;
        }
        if(flag==true) {
        	System.out.println("Array is palindrome");
        }else {
        	System.out.println("Array is not palindrome");
        }
        sc.close();
	}
}
