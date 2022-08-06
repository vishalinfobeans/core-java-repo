package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

public class SyncList {
    public static void main(String[] argv) throws Exception
    {
        try {
  
            List<String> list = new ArrayList<String>();
            
            new Hashtable();
  
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            list.add("E");
  
            List<String> synlist = Collections
                                       .synchronizedList(list);
  
            //synchronized(synlist){
                for(String m : synlist){
                    System.out.println(m);
                }
           // }           
        }
  
        catch (IllegalArgumentException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
