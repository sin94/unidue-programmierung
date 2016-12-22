/**
 * Created by:
 * Institut für Informatik und Wirtschaftsinformatik, Universität Duisburg-Essen
 *
 * For learning purpose only.
 *
 * Solved/Edited by Oppa Hansi. Possible solution - there are other ways to
 * solve these tasks.
 */
package com.oppahansi.ws1617.mp.mp4;

public class Miniprojekt4 {
	public static void main(String[] args) {

		// Ergaenzen Sie bei Bedarf hier weitere Methodenaufrufe zum Testen von Aufgabe 1. Kommentieren Sie in dem Fall die unteren drei
		// Zeilen vorlaeufig aus!

		Kurznachrichtendienst dienst = new Kurznachrichtendienst(7);
		NutzerSchnittstelle userInterface = new NutzerSchnittstelle(dienst);
		userInterface.start();
	}
}
