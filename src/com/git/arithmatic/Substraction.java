package com.git.arithmatic;

public class Substraction {

	private int sub(int num1, int num2) {
		return num1 - num2;
	}

	public int sub(int... numbers) {
		int result = 0;
		for (int num : numbers) {
			result = sub(result, num);
		}
		return result;
	}
}
