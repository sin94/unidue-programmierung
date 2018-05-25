package com.oppahansi.ss18.mp2;

/**
 * Implements a visitor that prints the field colors. 
 * 
 * @author Marcus
 */
public class ColorPrinter implements Visitor {
	/**
	 * Prints the field color at the current position
	 * using System.out.print (not println).
	 */
	@Override
	public void nextField(Field field) {
		System.out.print(field.getColor());
	}
	
	/**
	 * Prints a new line using System.out.println.
	 */
	@Override
	public void nextRow() {
		System.out.println();
	}
}
