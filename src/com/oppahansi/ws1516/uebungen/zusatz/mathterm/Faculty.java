/**
 * Created by:
 * Institut für Informatik und Wirtschaftsinformatik, Universität Duisburg-Essen
 *
 * For learning purpose only.
 *
 * Solved/Edited by Martin. Possible solution - there are other ways to
 * solve these tasks.
 *
 * Lange Nacht der Programmierung
 */

package com.oppahansi.ws1516.uebungen.zusatz.mathterm;

public class Faculty extends UnaryOperation {

	public Faculty(Expression expression) {
		super(expression);
	}

	@Override
	public int evaluate() {
		int value = expression.evaluate();
		
		int result = 1;
		
		for(int i = 2; i <= value; i++) {
			result *= i;
		}
		
		return result;
	}

}
