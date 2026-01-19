/**
 * 
 */
package com.capgenimi.java_development.module_3_class_object;

//import java.lang.reflect.Array;
import java.util.Scanner;
/**
 * 
 */
public class ClassArray {
	public static void execute() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter arr size: ");
		int num=sc.nextInt();
		sc.nextLine();
		Student[] arr=new Student[num];
		for(int i=0;i<num;i++) {
			System.out.print("Enter name: ");
			String name=sc.nextLine();
			System.out.print("Enter roll number: ");
			int roll=sc.nextInt();
			sc.nextLine();
			arr[i]=new Student(name,roll);
			System.out.println();
		}
		System.out.println("\n Displaying Students \n");
		for(int i=0;i<num;i++) {
			System.out.println(arr[i].getName()+" "+arr[i].getRoll());
		}
		sc.close();
		
	}
}
