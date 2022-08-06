package com;

class Test  

{ 
 
static int test_a, test_b; 
 
Test(int a, int b)  
 
{ 
 
test_a = a;  
 
test_b = b;  
 
} 
 
public  void main (String args[])  
 
{ 
 
     Test test = new Test(1, 1);  
 
     System.out.println(test.test_a+" "+test.test_b); 
     System.out.println(test_a);
 
} 
 
} 
