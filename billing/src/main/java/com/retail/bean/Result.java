package com.retail.bean;

public class Result {

	String message;
	double finalAmt;
	double genDiscAmt;
	double percDisc;

	public double getGenDiscAmt() {
		return genDiscAmt;
	}

	public void setGenDiscAmt(double genDiscAmt) {
		this.genDiscAmt = genDiscAmt;
	}

	public double getPercDisc() {
		return percDisc;
	}

	public void setPercDisc(double percDisc) {
		this.percDisc = percDisc;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getFinalAmt() {
		return finalAmt;
	}

	public void setFinalAmt(double finalAmt) {
		this.finalAmt = finalAmt;
	}

}
