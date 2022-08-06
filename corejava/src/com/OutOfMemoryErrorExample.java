package com;

import java.util.Arrays;
import java.util.stream.Collectors;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        Long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println(maxMemory);
        
        try {
        Long [] matrix = new Long[(maxMemory.intValue())];
       for(int i = 1; i < maxMemory; i++) {
            System.out.println(i);
        }
       // Arrays.stream(matrix).parallel().forEach(x->System.out.println(x));
        }catch(Error r) {
        	System.out.println("error ="+r);
        }
        System.out.println("rst of code");
        
    }
}
