package com.java.assginmentfour.sessionassginment1;

public class Child extends Parent {
	public void method1() {
	System.out.println ("Child's method1()");
	}
	public static void main(String args[]) {
	Parent p = new Child();
	p.method2();
	}
}


/*
 *OUTPUT :
 *	Parent's method2()
	Parent's method1()
 */
 