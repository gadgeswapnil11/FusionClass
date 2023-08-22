package com.FusionDay5;

public class StaticVar {

	static int a = 10;
	static String b = "Swapnil";
	int c=22;
	
	
	public static void  test1() {
		System.out.println(a);
	}

	public void name() {
		System.out.println();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar stat=new StaticVar();
		System.out.println(stat.a +" Not recommended "); //Not recommended 
		System.out.println(StaticVar.a+" recommended"); // recommended 
		System.out.println(a + " Directly access within same class");  //Directly access within same class
		
		stat.test1();

	}

}
