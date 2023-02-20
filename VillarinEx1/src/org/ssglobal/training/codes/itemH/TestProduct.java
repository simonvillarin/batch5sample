package org.ssglobal.training.codes.itemH;

public class TestProduct {
	public static void main(String[] args) {
		Product lamp = new Product(); // instantiate
		lamp.name = "IKEA Lamp";
		lamp.numberOfPieces = 0;
		
		lamp.downLoad(25);
		System.out.println(lamp.print());
		lamp.upLoad(20);
		System.out.println(lamp.print());
	}
}
