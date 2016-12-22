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

public class Kurznachrichtendienst {

	private HashKnoten[] hashtabelle;
	private int nachrichtenId = 0;

	public int getNachrichtenId() {
		return nachrichtenId;
	}

	public void setNachrichtenId(int nachrichtenId) {
		this.nachrichtenId = nachrichtenId;
	}

	public void setHashtabelle(HashKnoten[] hashtabelle) {
		this.hashtabelle = hashtabelle;
	}

	public HashKnoten[] getHashtabelle() {
		return hashtabelle;
	}

	// TODO AUFGABE 2a
	public Kurznachrichtendienst(int hashlaenge) {
		// Implementieren Sie hier Ihre Loesung
	}

	// TODO AUFGABE 2b
	public int hashfunktion(String s) {
		// Implementieren Sie hier Ihre Loesung
		return -1;
	}

	// TODO AUFGABE 2c
	public void sortiereNachrichtEin(Nachricht nachricht) {
		// Implementieren Sie hier Ihre Loesung
	}

	// TODO AUFGABE 2d
	public void neueNachricht(String verfasser, String inhalt) {
		// Implementieren Sie hier Ihre Loesung
	}

	// TODO AUFGABE 2e
	public void antworteAufNachricht(String verfasser, String inhalt, int id) {
		// Implementieren Sie hier Ihre Loesung
	}

	// TODO AUFGABE 2f
	public void loescheNachricht(int id) {
		// Implementieren Sie hier Ihre Loesung
	}

	// TODO AUFGABE 3a
	public int anzahlUnterschiedlicheHashtags() {
		// Implementieren Sie hier Ihre Loesung
		return -1;
	}

	// TODO AUFGABE 3b
	public int anzahlNachrichten() {
		// Implementieren Sie hier Ihre Loesung
		return -1;
	}

	// TODO AUFGABE 3c
	public double verhaeltnisZeigerZuHashKnoten() {
		// Implementieren Sie hier Ihre Loesung
		return -1;
	}

	// TODO Aufgabe 3d
	public int anzahlNachrichtenMindestReferenztiefe(int n) {
		// Implementieren Sie hier Ihre Loesung
		return -1;
	}
}
