package ipa;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorListIteratorExample {
	public static void main(String[] args) {

		List listObject = new ArrayList();
		listObject.add("Alive");
		listObject.add("Love");

		ListIterator listIteratorObject = listObject.listIterator();
		while (listIteratorObject.hasPrevious()) {
			System.out.println(listIteratorObject.next());
			listIteratorObject.add("Ali232");
			listIteratorObject.add("343Love");
		}
		System.out.println(listObject);
	}
}
