package com.retail.bean;

import com.retail.entity.Item;

public class UserBean {
	
	double amount;
	String userType;
	Item itemType;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public Item getItemType() {
		return itemType;
	}
	public void setItemType(Item itemType) {
		this.itemType = itemType;
	}
	

}
