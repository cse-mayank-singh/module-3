package com.capgenimi.java_development.module_3_class_object;
import java.util.Scanner;
public class StringQues {
	public static void execute() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input string: ");
		String s=sc.nextLine();
		System.out.print("Digits as char in input string: ");
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isDigit(ch)) {
				System.out.print(ch+" ");
			}
		}
		System.out.print("\nLowercase Alphabets in input string: ");
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLowerCase(ch)) {
				System.out.print(ch+" ");
			}
		}
		System.out.print("\nUppercase Alphabets in input string: ");
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.print(ch+" ");
			}
		}
		System.out.println();
		sc.close();
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] directions = {"North", "North-East", "East", "South-East", "South", "South-West", "West", "North-West"};
        System.out.print("Days of the Week: ");
        for (String day : daysOfWeek) {
            System.out.print(day + " ");
        }
        System.out.println("\n");
        System.out.print("Months of the Year: ");
        for (String month : months) {
            System.out.print(month + " ");
        }
        System.out.println("\n");
        System.out.print("Directions: ");
        for (String dir : directions) {
            System.out.print(dir + " ");
        }
        System.out.println();
	}
}