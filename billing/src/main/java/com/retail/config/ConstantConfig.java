package com.retail.config;

public class ConstantConfig {
	
	//private constructor
	private ConstantConfig() {}

	private static int empDisc = 30;
	private static int affDisc = 10;
	private static int custDisc = 5;
	private static int amtDisc = 5;
	public static int getEmpDisc() {
		return empDisc;
	}
	public static int getAffDisc() {
		return affDisc;
	}
	public static int getCustDisc() {
		return custDisc;
	}
	public static int getAmtDisc() {
		return amtDisc;
	}

	

}
