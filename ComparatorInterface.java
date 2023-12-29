package com.jspider;

import java.util.Arrays;
import java.util.Comparator;
class BMW{
	String brand;
	int price;
	int model;
	String color;
	BMW(String brand,int price,int model,String color){
		this.brand=brand;
		this.price=price;
		this.model=model;
		this.color=color;
	}
	
    public String toString() {
    	String s="["+brand+","+price+","+model+","+color+"]";
    	return s;
    }
	
	
//	public int compareTo(Object o) {
//		Car s=(Car)o;
//		return s.brand.compareToIgnoreCase(this.brand);
//	}
	
}

class SortAccordingToPrice implements Comparator{
	public int compare(Object o1,Object o2) {
		BMW c1=(BMW)o1;
		BMW c2=(BMW)o2;
		return c1.price-c2.price;
	}
	
}
class SortAccordingToColor implements Comparator{
	public int compare(Object o1,Object o2) {
		BMW c1=(BMW)o1;
		BMW c2=(BMW)o2;
		return c1.color.compareToIgnoreCase(c2.color);
	}
	
}

public class ComparatorInterface {

	public static void main(String[] args) {
	 BMW c[]=new BMW[5];
	 
		  c[0]=new BMW("BMW",8000000,2021,"Black");
		  c[1]=new BMW("Maruti",800000,2019,"Yellow");
		  c[2]=new BMW("Hyundai",900000,2020,"White");
		  c[3]=new BMW("tata",500000,2018,"Blue");
		  c[4]=new BMW("Toyoto",5500000,2023,"Red");
	  
	  
	  Arrays.sort(c, new SortAccordingToPrice());
	  for(int i=0;i<5;i++) {
		  System.out.println(c[i]);
	  }
	  System.out.println("=========");
      Arrays.sort(c,new SortAccordingToColor());
      for(int i=0;i<5;i++) {
		  System.out.println(c[i]);
	  }
	}

}
