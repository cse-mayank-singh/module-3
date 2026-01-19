package com.capgenimi.java_development.module_3_class_object;
import java.util.Scanner;
public class Palindrome {
	public static void execute() {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer s1=new StringBuffer();
		for(int i=s.length()-1;i>=0;i--) {
			s1.append(s.charAt(i));
		}
		String c=s1.toString();
		if(c.equals(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		String ss = "NAMAN";
		StringBuffer sb = new StringBuffer(ss);
		sb.reverse();
		if (sb.toString().equals(ss)) {
		    System.out.println("Palindrome");
		}
		sc.close();
	}
}
