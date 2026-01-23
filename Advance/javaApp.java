/**
 * 
 */
package Advance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 
 */
import java.util.*;
/**
 * 
 */
public class javaApp {
   public static void display(Student[] students) {
	   for(Student student:students) {
		   System.out.println(student);
	   }
	   System.out.println();
   }
   public static void execution() {
//	   Student[] students=new Student[4];
//	   students[0]=new Student(1,"Mahendra","mahendra123@gmail.com",9876543221l);
//	   students[1]=new Student(2,"Suresh","Suresh123@gmail.com",9876543221l);
//	   students[2]=new Student(21,"Sahil","Sahil123@gmail.com",9876543221l);
//	   students[3]=new Student(4,"Mayank","Mayank123@gmail.com",9876543221l);
//	   display(students);
//	   Arrays.sort(students);
//	   display(students);
	   InputStreamReader i=new InputStreamReader(System.in);
	   BufferedReader b=new BufferedReader(i);
	   System.out.println("Enter the byte data");
	   try {
		   byte byteData=Byte.parseByte(b.readLine());
		   System.out.println(byteData);
	   }catch(IOException e) {
		   e.printStackTrace();
	   }finally {
		   try {
			   b.close();
			   i.close();
		   }catch(IOException ee) {
			   ee.printStackTrace();
		   }
	   }
	   
   }
}