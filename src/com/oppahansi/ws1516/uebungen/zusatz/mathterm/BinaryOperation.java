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

public abstract class BinaryOperation implements Expression {

	Expression leftExpression;
	Expression rightExpression;
	
	public BinaryOperation(Expression leftExpression, Expression rightExpression) {
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	
}
