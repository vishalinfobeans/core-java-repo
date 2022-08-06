package com;

public class CC implements AA, BB{

	@Override
	public void print() {
		AA.super.print();
	}
	
	
	
	public static void main(String[] args) {
		//static int a = 2;
		int  a = 200;
		byte b = (byte) a;
		System.out.println(b);
	}

}
