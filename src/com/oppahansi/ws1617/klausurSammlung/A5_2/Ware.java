/**
 * Shared by Tornike K.
 */
package com.oppahansi.ws1617.klausurSammlung.A5_2;

public abstract class Ware {

	String Art; int Preis; 
	int Preis() { 
		return Preis * (100 - Rabatt()) / 100; 
		}
	Ware(String Art, int Preis){ 
		this.Art = Art; this.Preis = Preis;
	    System.out.println("Ware " + Art + " " + Preis + " Cent");
	}
	abstract int Rabatt(); 
}
