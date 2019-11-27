package com.retail.discount;

import com.retail.bean.Result;
import com.retail.config.ConstantConfig;
import com.retail.entity.Item;
import com.retail.service.RetailService;

public abstract class Discount implements RetailService{

	/**
	 * 
	 * @param amount
	 * @return calculated discount for each $100 over whole amount
	 */
	public int getAmountDiscount(double amount) {
		try {
			int res = (int) (amount / 100);
			res = ConstantConfig.getAmtDisc() * res;
			return res;
		} catch (NumberFormatException numEx) {
			return 0;
		}
	}

	/**
	 * Method to implement percentage discounts
	 * 
	 * @param amount
	 * @return amount after deducting percentage discounts
	 */
	public double getDiscount(double amount, double discPercent) {
		try {
			return  (discPercent / 100) * amount;
		} catch (NumberFormatException numEx) {
			return amount;
		}
	}

	/**
	 * Method to provide final Bill Amount
	 * 
	 * @param discAmt
	 * @param genDiscAmt
	 * @return final Bill Amount
	 */
	public double getFinalAmount(double actlAmt, double discAmt, double genDiscAmt) {
		try {
			return actlAmt - (discAmt + genDiscAmt);
		} catch (NumberFormatException numEx) {
			return 0;
		}
	}
	
	/**
	 * This method must be implemented by entities to implement their own logic
	 * @param itemtype
	 */
	public abstract Result generateBill(Item itemtype);

}
