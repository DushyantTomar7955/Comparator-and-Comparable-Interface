package com.jspider;

import java.util.*;
class Car implements Comparable{
	String brand;
	int price;
	int model;
	String color;
	Car(String brand,int price,int model,String color){
		this.brand=brand;
		this.price=price;
		this.model=model;
		this.color=color;
	}
	
    public String toString() {
    	String s="["+brand+","+price+","+model+","+color+"]";
    	return s;
    }
	
	
	public int compareTo(Object o) {
		Car s=(Car)o;
		return s.brand.compareToIgnoreCase(this.brand);
	}
	
}

public class CompareToMethod {

	public static void main(String[] args) {
	 Car c[]=new Car[5];
	  for(int i=0;i<5;i++) {
		  c[0]=new Car("BMW",8000000,2021,"Black");
		  c[1]=new Car("Maruti",800000,2019,"Yellow");
		  c[2]=new Car("Hyundai",900000,2020,"White");
		  c[3]=new Car("tata",500000,2018,"Blue");
		  c[4]=new Car("Toyoto",5500000,2023,"Red");
	  }
	  
	  Arrays.sort(c);
	  for(int i=0;i<5;i++) {
		  System.out.println(c[i]);
	  }

	}

}
