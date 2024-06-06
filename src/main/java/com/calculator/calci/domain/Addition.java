package com.calculator.calci.domain;

public class Addition {
	private int num1;
	private int num2;
	private String operation;
	
	
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public double add() {
		return num1+num2;
	}
	public double subtract() {
		return num1-num2;
	}
	public double multiply() {
		return num1*num2;
	}
	public double divide() {
		if(num2!=0)
			return num1/num2;
		else
			throw new ArithmeticException("Cannot Divide by 0");
	}

}
