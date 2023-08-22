package com.FusionDay5;

public class Instance {

	int a;
	int b = 10;
	int c = a + b;
	String str = "";
	String str1 = "Swapnil";
	String instanceClass = " We can Access Dricetly in Non Static Methods";

	/*
	 * Non Static Method
	 */
	public void inst() {
		System.out.println(instanceClass); // Directly Call instance var into Non Static Method

	}

	public static void main(String[] args) {
		Instance ins = new Instance();

		System.out.println("Default Value = "+ins.a);// Return Default Value
		System.out.println("Instance Variable = "+ins.b);// Return Assigned value
		System.out.println("Instance Variable = "+ins.c);// Return Assigned C value
		System.out.println("Default Value of String = "+ins.str);// Return Default Value
		ins.inst();
	}

}
