package com.capgenimi.java_development.module_3_class_object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
//Priority Queue dosent support heterogeneous data rest 3 does
public class Heterogeneous {
	public static void List() {
		ArrayList arr=new ArrayList();
		arr.add(1);arr.add(2.2);arr.add('A');arr.add(true);arr.add(null);arr.add('A');
		System.out.println(arr);
		System.out.println("=====================================");
	}
	public static void Queue() {
		PriorityQueue arr=new PriorityQueue();
		arr.add(1);arr.add(2.2);arr.add('A');arr.add(true);arr.add(null);arr.add('A');  //queue dosent support null
		System.out.println(arr);
		System.out.println("=====================================");
	}
	public static void Set() {
		HashSet arr=new HashSet();
		arr.add(1);arr.add(2.2);arr.add('A');arr.add(true);arr.add(null);arr.add('A'); //no duplicates in set
		System.out.println(arr); 
		System.out.println("=====================================");
	}
	public static void Mapp() {
		HashMap arr=new HashMap();
		arr.put(1,2);arr.put('A','B');arr.put(3.3,3.3);arr.put(true,false);arr.put(false, 1);arr.put(null,null);arr.put('D','D');
		System.out.println(arr);
		System.out.println("=====================================");
	}
}
