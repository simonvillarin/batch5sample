package org.ssglobal.training.codes.itemF;

public class AssignMe {
	public static void main(String[] args) {
		int x = 3;
		int y = x * 2;
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("The value of x is " + x + " and the value of y is " + y);
	}
}
