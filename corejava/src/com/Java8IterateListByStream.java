package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8IterateListByStream {
	public static void main(String[] args) {
		List<Item> list = new ArrayList<>();
		Item i1 = new Item(100, "ram");
		Item i2 = new Item(200, "shyam");
		Item i3 = new Item(1001, "ramaya");
		Item i4 = new Item(2002, "yashyam");
		list.add(i1); list.add(i2);list.add(i3); list.add(i4);
		
		//List<Item> collect = list.stream().map(itm -> new Item(itm.item_ID+1000, itm.item_name.toUpperCase())).collect(Collectors.toList());
		//System.out.println(collect.get(0).getItem_ID());
		
		List<String> list1 = list.stream().filter(item -> item.getItem_ID() == 100).map(Item :: getItem_name).collect(Collectors.toList());
		 list.stream().map(item -> item.getItem_name()).filter(item -> item=="df").collect(Collectors.toList());
		 
		list1.forEach(System.out::println);
//		Set<String> listObj = new HashSet<String>();
//		listObj.add(null);
//		listObj.add("eBay1");
//		listObj.add("eBay2");
//		
//		
//		listObj.forEach((temp) -> {
//			System.out.println(temp);
//		});
//		
//		listObj.forEach(x ->{
//			
//		});

	}
}
