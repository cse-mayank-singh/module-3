package com.capgenimi.java_development.module_3_class_object;
public class OverridingObject{
	  private Integer id;
	  private String name;
	  private String brand;
	  private Double price;
	  /**
	   * @param id
	   * @param name
	   * @param brand
	   * @param price
	   */
	  public OverridingObject(int id, String name, String brand, double price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	  }
	  @Override
	  public String toString() {
		  return "Id: "+id+" , Name: "+name+" ,Brand: "+brand+" price: "+price;
	  }
	  @Override
	  public boolean equals(Object obj) {
		  OverridingObject p=(OverridingObject)obj;
		  if( 
			(this.id.equals(p.id)) && (this.name.equals(p.name)) && (this.brand.equals(p.brand)) && (this.price.equals(p.price))
				  ) {
			  return true;
		  }
		  else {
			  return false;
		  }
	  }
	  @Override
	  public int hashCode() {
		  return java.util.Objects.hash(id,name,brand,price);
	  }
	}