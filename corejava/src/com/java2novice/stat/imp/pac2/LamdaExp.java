package com.java2novice.stat.imp.pac2;

interface InterfaceA {
	  default String canPerform() {
	    return "Hello A";
	  }
	}

	interface InterfaceB {
	  default String canPerform() {
	   return "Hello B";
	  }
	}

	class ConcreteC implements InterfaceA, InterfaceB {

		@Override
		public String canPerform() {
			return InterfaceA.super.canPerform();
		}

	}
@FunctionalInterface
interface Itre{
	public static final int i = 3;
	public  int m1(int i, int j);
	
	default int m2() {
		return 0;
	}
	
	static int m3() {
		return 0;
	}
	
}

public class LamdaExp {
	public static void main(String[] args) {
		Itre itr = (i, j)->{
			 return i+j;
		};
		int m1 = itr.m1(10, 20);
	}
}
