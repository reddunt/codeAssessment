package com.retail.billing;

import org.junit.jupiter.api.Test;

import com.retail.bean.Result;
import com.retail.bean.UserBean;
import com.retail.discount.Discount;
import com.retail.entity.Item;
import com.retail.factory.FactoryObjectBuilder;

class JUnitTest {

	/**
	 * Test Case 1 : Test for Employee with Grocery
	 */
	@Test
	void testCase1() {
		UserBean user = new UserBean();
		user.setAmount(990);
		user.setUserType("Employee");
		user.setItemType(Item.GROCERRY);
		FactoryObjectBuilder builderObj = new FactoryObjectBuilder();
		Discount obj = builderObj.getFactoryObject(user);
		Result result = obj.generateBill(user.getItemType());

		System.out.println("Store generic discount is : " + result.getGenDiscAmt());
		System.out.println("Store percentage discount is : " + result.getPercDisc());
		System.out.println("Final Bill amount is : " + result.getFinalAmt());
		System.out.println(result.getMessage());
	}

	/**
	 * Test Case 2 : Test for Affiliates with Grocery
	 */
	@Test
	void testCase2() {
		UserBean user = new UserBean();
		user.setAmount(990);
		user.setUserType("Affiliate");
		user.setItemType(Item.GROCERRY);
		FactoryObjectBuilder builderObj = new FactoryObjectBuilder();
		Discount obj = builderObj.getFactoryObject(user);
		Result result = obj.generateBill(user.getItemType());

		System.out.println("Store generic discount is : " + result.getGenDiscAmt());
		System.out.println("Store percentage discount is : " + result.getPercDisc());
		System.out.println("Final Bill amount is : " + result.getFinalAmt());
		System.out.println(result.getMessage());
	}

	/**
	 * Test Case 3 : Test for Customers with Grocery
	 */
	@Test
	void testCase3() {
		UserBean user = new UserBean();
		user.setAmount(990);
		user.setUserType("Customer");
		user.setItemType(Item.GROCERRY);
		FactoryObjectBuilder builderObj = new FactoryObjectBuilder();
		Discount obj = builderObj.getFactoryObject(user);
		Result result = obj.generateBill(user.getItemType());

		System.out.println("Store generic discount is : " + result.getGenDiscAmt());
		System.out.println("Store percentage discount is : " + result.getPercDisc());
		System.out.println("Final Bill amount is : " + result.getFinalAmt());
		System.out.println(result.getMessage());
	}

	/**
	 * Test Case 4 : Test for Non-Grocery Items along with Employee
	 */
	@Test
	void testCase4() {
		UserBean user = new UserBean();
		user.setAmount(990);
		user.setUserType("Employee");
		user.setItemType(Item.DAIRY);
		FactoryObjectBuilder builderObj = new FactoryObjectBuilder();
		Discount obj = builderObj.getFactoryObject(user);
		Result result = obj.generateBill(user.getItemType());

		System.out.println("Store generic discount is : " + result.getGenDiscAmt());
		System.out.println("Store percentage discount is : " + result.getPercDisc());
		System.out.println("Final Bill amount is : " + result.getFinalAmt());
		System.out.println(result.getMessage());
	}

	/**
	 * Test Case 5 : Test for Non-Grocery Items along with Customer
	 */
	@Test
	void testCase5() {
		UserBean user = new UserBean();
		user.setAmount(990);
		user.setUserType("Customer");
		user.setItemType(Item.DAIRY);
		FactoryObjectBuilder builderObj = new FactoryObjectBuilder();
		Discount obj = builderObj.getFactoryObject(user);
		Result result = obj.generateBill(user.getItemType());

		System.out.println("Store generic discount is : " + result.getGenDiscAmt());
		System.out.println("Store percentage discount is : " + result.getPercDisc());
		System.out.println("Final Bill amount is : " + result.getFinalAmt());
		System.out.println(result.getMessage());
	}

	/**
	 * Test Case 6 : Test for Non-Grocery Items along with Affilates
	 */
	@Test
	void testCase6() {
		UserBean user = new UserBean();
		user.setAmount(990);
		user.setUserType("Affiliate");
		user.setItemType(Item.DAIRY);
		FactoryObjectBuilder builderObj = new FactoryObjectBuilder();
		Discount obj = builderObj.getFactoryObject(user);
		Result result = obj.generateBill(user.getItemType());

		System.out.println("Store generic discount is : " + result.getGenDiscAmt());
		System.out.println("Store percentage discount is : " + result.getPercDisc());
		System.out.println("Final Bill amount is : " + result.getFinalAmt());
		System.out.println(result.getMessage());
	}
}