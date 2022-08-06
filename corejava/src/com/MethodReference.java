package com;

import java.util.function.BiFunction;

//interface Sayable{  
//    void say(); 
//    void say(int i);
//}  
//public class MethodReference {  
//    public static void saySomething(){  
//        System.out.println("Hello, this is static method.");  
//    }  
//    public static void saySomething1(int i){  
//        System.out.println("Hello, this is static method.");  
//    } 
//    public static void main(String[] args) {  
//        Sayable sayable = MethodReference::saySomething;  
//        sayable.say();  
//        
//        Sayable sayable1 =(i)->{
//        } 
//    }  
//}  

class Arithmetic {
	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}
	
	public void testV() {
		System.out.println("hello");
	}
}

public class MethodReference {
	public static void main(String[] args) {
//int i = Arithmetic::add;  
		BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
		BiFunction<Float, Float, Float> adder3 = Arithmetic::add;
//int result1 = adder1.apply(10, 20);  
		float result2 = adder2.apply(10, 20.0f);
		float result3 = adder3.apply(10.0f, 20.0f);
		
//System.out.println(result1);  
		System.out.println(result2);
		System.out.println(result3);
		
	}
}
