package org.ssglobal.training.codes.itemH;

public class Product {
	public String name;
	public int numberOfPieces;
	
	public void downLoad(int numberOfPieces) {
		this.numberOfPieces += numberOfPieces;
	}
	
	public void upLoad(int numberOfPieces) {
		this.numberOfPieces -= numberOfPieces;
	}
	
	public String print() {
		return name + ", " + numberOfPieces + " pieces";
	}
}
