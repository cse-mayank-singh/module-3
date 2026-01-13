package com.capgenimi.java_development.module_3_class_object;
public class Hello {
	/**
	 * @param args
	 */
	private String ans;
	private String name;
	public Hello(String ans, String name){
		super();
		this.ans = ans;
		this.name = name;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}