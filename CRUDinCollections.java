package com.capgenimi.java_development.module_3_class_object;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class CRUDinCollections {
	public static void List() {
		ArrayList<Integer> arr=new ArrayList<Integer>();//create
		arr.add(1);arr.add(2);arr.add(3);arr.add(4);//insert
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");//read
		}
		System.out.println();
		for(Integer it:arr) {
			System.out.print(it+" ");
		}
		System.out.println();
		Iterator<Integer> iterator=arr.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		ListIterator<Integer> listIterator=arr.listIterator(arr.size());
		while(listIterator.hasPrevious()){
			System.out.print(listIterator.previous()+" ");
		}
		System.out.println();
		arr.set(1, 22);//update
		arr.remove(3);//delete
		for(Integer it:arr) {
			System.out.print(it+" ");     
		}
		System.out.println();
		System.out.println("=====================================");	
	}	
}
