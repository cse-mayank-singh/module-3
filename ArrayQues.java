/**
 * 
 */
package com.capgenimi.java_development.module_3_class_object;

/**
 * 
 */
import java.util.Scanner;
public class ArrayQues {
	public static void execute() {
		int size=10;
		int[] arr=new int[size];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			int temp=in.nextInt();
			arr[i]=temp;
		}
		System.out.println("Even Number of Array: ");
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Odd Number of Array: ");
		for(int i=0;i<size;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		in.close();
	}
}
