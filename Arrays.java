/**
 * 
 */
package com.capgenimi.java_development.module_3_class_object;

import java.lang.reflect.Array;

/**
 * 
 */
public class Arrays {
	public static void execution(){
		//traditional
//	int[] arr=new int[5];
//	arr[0]=1;
//	arr[1]=2;
//	arr[2]=3;
//	arr[3]=4;
//	arr[4]=5;
//	for(int i:arr) {
//		System.out.print(i+" ");
//	}
//	for(int i=0;i<arr.length;i++) {
//		System.out.println(arr[i]);
//	}
		            //Modern
	int[] arr=(int[]) Array.newInstance(int.class, 5);
	Array.setInt(arr, 0, 10);
	Array.setInt(arr, 1, 11);
	Array.setInt(arr, 2, 12);
	Array.setInt(arr, 3, 13);
	Array.setInt(arr, 4, 14);
	for(int i:arr) {
		System.out.print(i+" ");
	}
	System.out.println();
	for(int i=0;i<arr.length;i++) {
		System.out.print(Array.getInt(arr, i)+" ");
	}
	}
}
