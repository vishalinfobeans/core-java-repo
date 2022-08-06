package ipa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
  
class Student {
  
    private Integer id;
  
    private String name;
  
    public Student(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }
  
    public Integer getId()
    {
        return id;
    }
  
    public String getName()
    {
        return name;
    }
}
  
public class ListToMap {
  
    public static void main(String[] args)
    {
        List<Student> lt = new ArrayList<>();
  
        lt.add(new Student(112, "Geeks"));
        lt.add(new Student(222, "For"));
        lt.add(new Student(31, "Geeks"));
  
		Map<Integer, String> collect = lt.stream().collect(Collectors.toMap(Student::getId, Student::getName));

		collect.forEach(
            (x, y) -> System.out.println(x + "=" + y));
		
		System.out.println("===============");
				collect.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x ->System.out.println(x));
    }
}
