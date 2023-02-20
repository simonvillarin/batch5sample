package org.ssglobal.training.codes.itemI;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		// declare and initialize data
		double Celsius = 35.5;
		double Fahrenheit = 22.6;		
		
		// calculate celsius equiavalent 
		double celsius = (Fahrenheit - 32) * 5 / 9;	
		
		// output results
		System.out.println(Fahrenheit + "\u00B0F = " + celsius + "\u00B0C");
		
		/*
		 *	8 Compilation Errors
		 *	1. float Celsius's data type should be double
		 *	2. float Fahrenheit's data type should be double
		 *	3. The letter f in double celsius = (5/9) * fahrenheit - 32 
		 *		should be in capital letter
		 *	4. The letter f in System.out.println(Fahrenheit, "\u00B0F = ") 
		 *		should be in capital letter
		 *  5. Wrong spelling of celsius when printing it
		 *  6. The letter U in "\U00B0F" should be in small capital letter
		 *  7. To concat Fahrenheit and "\u00B0F", you should use +
		 *  8. To concat celsius and "\u00B0C", you should use +
		 *  
		 *  3 Logical Errors
		 *  1. The Fahrenheit - 32 should be in the beginning and then multiply it by 5 / 9
		 *  2. There should be no parenthesis in (5/9)
		 *  3. There should be a parenthesis in Fahrenheit - 32
		 *  
		 *  
		 *  3 User Experience Errors
		 *  1. There should be no x in the class name
		 *  2. There is no need of declaring a value of Celcius
		 *  3. The ( String [] args) should be (String[] args)
		 *  
		 *  1 Readability Error
		 *  1. After the equal sign, you should concat the value of celsius and "\u00B0C"
		 */ 
	}
}
