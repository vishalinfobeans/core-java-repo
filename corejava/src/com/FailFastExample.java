package com;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Parent {    
	  void msg()throws Exception{  
		    System.out.println("parent method");  
		  }    
		}    
		    
		class TestExceptionChild5 extends Parent{    
		  void msg() {  
		    System.out.println("child method");  
		  }    
		    
		  public static void main(String args[]){    
		   Parent p = new TestExceptionChild5();    
		     
		   try {    
		   p.msg();    
		   }  
		   catch(Exception e) {}  
		       
		  }    
		}     