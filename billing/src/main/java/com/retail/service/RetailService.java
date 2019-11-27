package com.retail.service;

public interface RetailService {

	public int getAmountDiscount(double amount);
	public double getDiscount(double amount, double discPercent);
	public double getFinalAmount(double actlAmt, double discAmt, double genDiscAmt);
	
}
