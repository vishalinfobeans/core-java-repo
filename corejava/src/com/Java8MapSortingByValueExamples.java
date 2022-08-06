package com;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
 
public class Java8MapSortingByValueExamples {
 
  public static void main(String[] args) {
    System.out.println("\nSorting using Java8 streams\n");
     
    sortByValueJava8Stream();
  }
 
  private static void sortByValueJava8Stream() 
  {
    Map<String, Integer> unSortedMap = getUnSortedMap();
     
    System.out.println("Unsorted Map : " + unSortedMap);
    
    Map<String, Integer> sortedMap = new LinkedHashMap<>();

    unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
        .forEach(x -> sortedMap.put(x.getKey(), x.getValue()));
     
    System.out.println("Sorted Map   : " + sortedMap);
     
    LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
    unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
        .forEach(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
     
    System.out.println("Reverse Sorted Map   : " + reverseSortedMap);
    
    LinkedHashMap<String, Integer> reverseSortedMa = new LinkedHashMap<>();
    unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
        .forEach(x -> reverseSortedMa.put(x.getKey(), x.getValue()));
    
    System.out.println("sort by key   : " + reverseSortedMa);
  }
 
  private static Map<String, Integer> getUnSortedMap() 
  {
    Map<String, Integer> unsortMap = new HashMap<>();
    unsortMap.put("alex", 1);
    unsortMap.put("david", 2);
    unsortMap.put("elle", 3);
    unsortMap.put("charles", 4);
    unsortMap.put("brian", 5);
    return unsortMap;
  }
}

