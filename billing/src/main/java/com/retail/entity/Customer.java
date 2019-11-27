package com.retail.entity;

import com.retail.bean.Result;
import com.retail.discount.Discount;

public class Customer extends Discount {

	double amount;
	double discountPercentage;

	public Customer() {
	}

	public Customer(double amount, double discountPercentage) {
		this.amount = amount;
		this.discountPercentage = discountPercentage;
	}

	@Override
	public Result generateBill(Item itemType) {
		Result result = new Result();
		double amountDis = 0;
		double percentageDis = 0;
		try {
			amountDis = getAmountDiscount(amount);
			result.setGenDiscAmt(amountDis);
			if (!itemType.equals(Item.GROCERRY)) {
				percentageDis = getDiscount(amount, discountPercentage);
				result.setPercDisc(percentageDis);
			}
			double finalAmount = getFinalAmount(amount, amountDis, percentageDis);
			result.setFinalAmt(finalAmount);
			result.setMessage("Billing amount after discount is " + result.getFinalAmt());
		} catch (Exception e) {
			result.setGenDiscAmt(0.0);
			result.setPercDisc(0.0);
			result.setFinalAmt(0.0);
			result.setMessage(e.toString());
		}
		return result;
	}

}
