package com.FusionDay5;


public class Oprators {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		//Relational Operator
		System.out.println(" Reletional Oprator Start Here");

		System.out.println(a>b); // false = Check a is greater than b
		System.out.println(a<b);  //true =Check a is less than b
		System.out.println(a<=b); // true =Check a is less than and equals to  b 
		System.out.println(a==b); // true =Check a is  equals to  b 
		System.out.println(a!=b);  //true =Check a is not  equals to  b 
		
		//Assignment Operator
		System.out.println(" Assignment Oprator Start Here");
		byte e=10;
		byte f=121;
		int c=a+10;
		System.out.println(c);
		 a+=10;   //Implicitly  Type casting
		System.out.println(a);	
		System.out.println(e+f); //Explicitly Type Casting
		
		System.out.println(" Shift Oprator Start Here");
		System.out.println(a<<2);
		System.out.println(b<<5);
		System.out.println(a>>2);
		System.out.println(a>>5);



	}

}
