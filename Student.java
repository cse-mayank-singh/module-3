/**
 * 
 */
package com.capgenimi.java_development.module_3_class_object;
/**
 * 
 */
public class Student {
	private String name;
	private int roll;
	Student(String name,int roll){
		this.name=name;
		this.roll=roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
}
