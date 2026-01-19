package com.capgenimi.java_development.module_3_class_object;
public class StringBuffers {
	public static void execute() { 
		StringBuffer f1=new StringBuffer();
		f1.insert(0, "JABA");
		System.out.println(f1);
		f1.setCharAt(0, 'J');
		System.out.println(f1);
		f1.deleteCharAt(2);
		System.out.println(f1);
		
		String input = "Corejava";
	    String s1 = input.substring(0, 4).toUpperCase(); // CORE
	    String s2 = input.substring(4);                  // java
	    StringBuffer sb = new StringBuffer(s2);
	    String ans = sb.reverse().toString();
	    ans = ans + s1;
	    System.out.println(ans);
	}
}
