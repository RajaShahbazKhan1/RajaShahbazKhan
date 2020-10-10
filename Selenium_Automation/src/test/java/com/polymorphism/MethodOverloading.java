package com.polymorphism;

public class MethodOverloading {

 
 }
 
   public void (String name); {
	System.out.println("RAJA SHAHBAZ");
}

   public void (int adress); {
	   System.out.println("2842 BRIGHAM STREET");
	   
}
   
   public void (int Id); {
	   System.out.println("101319");
}
   public static void main(String[] args) {
	   MethodOverloading obj = new  MethodOverloading();
	   obj.name();
	   obj.adress();
	   
}