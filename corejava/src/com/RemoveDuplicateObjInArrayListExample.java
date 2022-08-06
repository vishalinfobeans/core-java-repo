package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateObjInArrayListExample {
	List<Item> addItem = new ArrayList<Item>();

	List<Item> result = new ArrayList<Item>();
	
	Set<Integer> setObj = new HashSet<Integer>();

	private void removeLogic() {
		Item item1 = new Item(123, "shope");
		Item item11 = new Item(123, "shope");
		addItem.add(item1);
		addItem.add(item1);
		addItem.add(item11);
		for (Item item : addItem) {
			if (setObj.add(item.item_ID)) {
				result.add(item);
			}
		}
		System.out.println("result="+result.size());
	}
	public static void main(String[] args) {
		RemoveDuplicateObjInArrayListExample arrayList = new RemoveDuplicateObjInArrayListExample();
		arrayList.removeLogic();
	}
}
