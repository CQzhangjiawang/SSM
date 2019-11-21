package com.ssm.crud.test;

import java.util.UUID;

public class Outer {
	
	public void newInner() {
		new Inner();
	}
	class Inner {
		
	}
	public static void main(String[] args) {
		Outer outer = new Outer();
		Inner inner = outer.new Inner();
		String string = UUID.randomUUID().toString();
		System.out.println(string);
		
	}
}
