package com.FusionDay5;

import java.util.Scanner;

public class SysScanner {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input Value");
		int a=sc.nextInt();
		System.out.println(a+" This is Input Value");
		
		String b=sc.next();
		System.out.println("Enter Input Value String");
		System.out.println(b+" This is Input Value");
		
		
		double c=sc.nextDouble();
		System.out.println("Enter Input Value Double");
		System.out.println(c+" This is Input Value");


	}

}
