package com.retail.billing;

import com.retail.bean.Result;
import com.retail.bean.UserBean;
import com.retail.discount.Discount;
import com.retail.entity.Item;
import com.retail.factory.FactoryObjectBuilder;

public class Biller {
	public static void main(String[] args) {
		UserBean user = new UserBean();
		user.setAmount(990);
		user.setUserType("Affiliate");
		user.setItemType(Item.GROCERRY);
		
		
		FactoryObjectBuilder builderObj = new FactoryObjectBuilder();
		Discount obj = builderObj.getFactoryObject(user);
		
		//Fetching result
		Result result = obj.generateBill(user.getItemType());
		
		System.out.println("Store generic discount is : " + result.getGenDiscAmt());
		System.out.println("Store percentage discount is : "+ result.getPercDisc());
		System.out.println("Final Bill amount is : "+ result.getFinalAmt());
		System.out.println(result.getMessage());
	}
}
