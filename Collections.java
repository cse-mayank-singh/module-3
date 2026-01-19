package com.capgenimi.java_development.module_3_class_object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
//toString() equals() and hashCOde() are overrided already in ArrayList,HashSet and HashMap but only toString() method is overrided in PriorityQUeue
public class Collections {
	public static void List() {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);arr.add(2);arr.add(3);arr.add(4);
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		arr2.add(1);arr2.add(2);arr2.add(3);arr2.add(4);
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(arr.hashCode());
		System.out.println(arr2.hashCode());
		System.out.println(arr.equals(arr2));
		System.out.println("=====================================");
	}
	public static void Queue() {
		PriorityQueue<Integer> arr=new PriorityQueue<Integer>();
		arr.add(1);arr.add(2);arr.add(3);arr.add(4);
		PriorityQueue<Integer> arr2=new PriorityQueue<Integer>();
		arr2.add(1);arr2.add(2);arr2.add(3);arr2.add(4);
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(arr.hashCode());
		System.out.println(arr2.hashCode());
		System.out.println(arr.equals(arr2));
		System.out.println("=====================================");
	}
	public static void Set() {
		HashSet<Character> arr=new HashSet<Character>();
		arr.add('A');arr.add('B');arr.add('C');arr.add('D');
		HashSet<Character> arr2=new HashSet<Character>();
		arr2.add('A');arr2.add('B');arr2.add('C');arr2.add('D');
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(arr.hashCode());
		System.out.println(arr2.hashCode());
		System.out.println(arr.equals(arr2));
		System.out.println("=====================================");
	}
	public static void Mapp() {
		HashMap<Integer,Double> arr=new HashMap<Integer,Double>();
		arr.put(1,1.1);arr.put(2,2.2);arr.put(3,3.3);arr.put(4,4.4);
		HashMap<Integer,Double> arr2=new HashMap<Integer,Double>();
		arr2.put(1,1.1);arr2.put(2,2.2);arr2.put(3,3.3);arr2.put(4,4.4);
		System.out.println(arr);
		System.out.println(arr2);
		System.out.println(arr.hashCode());
		System.out.println(arr2.hashCode());
		System.out.println(arr.equals(arr2));
		System.out.println("=====================================");
	}
}
