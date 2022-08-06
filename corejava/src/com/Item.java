package com;

public class Item {
	public int item_ID;
	public String item_name;
	
	

	public int getItem_ID() {
		return item_ID;
	}

	public void setItem_ID(int item_ID) {
		this.item_ID = item_ID;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public Item(int item_ID, String item_name) {
		this.item_ID = item_ID;
		this.item_name = item_name;
	}
	
//	@Override
//	public int hashCode() {
//		return item_ID+item_name.hashCode();
//	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		System.out.println("========================="+super.hashCode());
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals call");
		Item item = (Item)obj;
		if(item.item_ID == this.item_ID || item.item_name.equals(this.item_name)){
			return true;
		}
		else{
			return false;
		}
	}
}
