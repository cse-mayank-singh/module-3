package com.capgenimi.java_development.module_3_class_object;
public class Stringss {
	public static void StringExec() {
		String s1="Hello World";
		String s2=new String("Hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());  //class String already overrides Object class methods. String is mutable while buffer and builder is not
		System.out.println();
		StringBuffer f1=new StringBuffer("Java");
		StringBuffer f2=new StringBuffer("Java");
		System.out.println(f1.equals(f2)); //class StringBuffer only overrides .toString() and not .equals() and .hashCode()Object class methods.
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());
		System.out.println();
		StringBuffer b1=new StringBuffer("Jaba");
		StringBuffer b2=new StringBuffer("Jaba");
		System.out.println(b1.equals(b2)); //class StringBuilder only overrides .toString() and not .equals() and .hashCode()Object class methods.
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println("================substrings=====================");
		String s3=s1.substring(4); //from 4th index till end of string
		String s4=s1.substring(3,6);//from 3rd index till 5th index (end-1)
		String s5=s1.substring(0,4);// from starting till 3rd index;
		System.out.println("Substrings are: "+s3+" "+s4+" "+s5);
	}
}