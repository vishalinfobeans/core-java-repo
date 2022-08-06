package com;

public class Emp123 
{
	private int age ;
	
	public Emp123( int age )
	{
		super();
		this.age = age;
	}

	public int hashCode()
	{
		System.out.println("hachcode call="+age);
		return System.identityHashCode(Emp123.class);
		//return age;
	}
	
	public int hashCode1() {
		System.out.println("hashcode call="+super.hashCode());
		return super.hashCode();
	}
	
	public int getAge() {
		return this.age;
	}
	
	public boolean equals( Object obj )
	{
		boolean flag = false;
		Emp123 emp = ( Emp123 )obj;
		System.out.println("equals call="+emp.getAge());
		if( this.age == emp.age )
			flag = true;
		return flag;
	}
	
	public boolean equals1(Object obj) {
		System.out.println("equals call+"+super.equals(obj));
		return super.equals(obj);
	}
	
}
