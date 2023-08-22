package com.FusionDay5;

import java.util.Scanner;

public class Calculator {

	public void basicCalculations(long a, long b) {
		System.out.println("Calculations are  Below According to Your Inputs"+'\n');
		long add = a + b;
		System.out.println("Addition = " + add+'\n');
		long c = a - b;
		System.out.println("Subtraction = " + c+'\n');
		System.out.println("Multiplication = " + a * b+'\n');
		System.out.println("Division = " + a / b+'\n');
		System.out.println("Squere of FristNumber = " + a * a+'\n');
		System.out.println("Squere of Second Number = " + b * b+'\n');
		System.out.println("Cube  of FristNumber = " + a * a * a+'\n');
		System.out.println("Cube of Second Number = " + b * b * b);
	}

	public static void main(String[] args) {
		System.out.println("          Welcome To Calculator Program"+'\n');
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Frist Number");
		long A = sc.nextInt();
		System.out.println("Please Enter Second number");
		long B = sc.nextInt();
		System.out.println();
		Calculator cl = new Calculator();
		cl.basicCalculations(A, B);

	}

}
