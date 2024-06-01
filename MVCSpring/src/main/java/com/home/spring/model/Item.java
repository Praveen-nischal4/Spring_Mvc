package com.home.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Item {

	//just now we hard code value not thought UI
	int itemId=10;
	String name="Air Conditioner";
	String category="Electronics";
	int rate=40000;
	int quantity=1;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", category=" + category + ", rate=" + rate + ", quantity="
				+ quantity + "]";
	}
	
	
}
