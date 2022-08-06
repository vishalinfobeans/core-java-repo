package ipa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class Table  
{      
 static  synchronized void printTable(int n){    
     for(int i=1;i<=5;i++){    
      System.out.println(n*i);    
      try{    
       Thread.sleep(400);    
      }catch(Exception e){System.out.println(e);}    
     }    
 }//end of the method    
}    
    
class MyThread1 extends Thread{    
Table t;    
MyThread1(Table t){    
this.t=t;    
}    
public void run(){    
t.printTable(5);    
}    
    
}    
class MyThread2 extends Thread{    
Table t;    
MyThread2(Table t){    
this.t=t;    
}    
public void run(){    
t.printTable(100);    
}    
}    
    
public class Temp{    
public static void main(String args[]){    
Table obj = new Table();//only one object 
Table obj1 = new Table();
MyThread1 t1=new MyThread1(obj);    
MyThread2 t2=new MyThread2(obj);

MyThread1 t3=new MyThread1(obj1);
MyThread1 t4=new MyThread1(obj1);
t1.start();    
t2.start();   

t3.start();    
t4.start();   

Map<Integer, String> m1 = new ConcurrentHashMap<>();
List<String> lis = new ArrayList<>();
Set<String> s = new HashSet<>();

Collections.sort(null);

m1.put(null, "visha");
String put = m1.put(2, null);

System.out.println(m1);


}    
}    