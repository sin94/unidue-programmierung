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

public class HashKnoten {
	private String hashtag;
	private HashKnoten nf;
	private Nachrichtenzeiger nzKopf;

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}

	public HashKnoten getNf() {
		return nf;
	}

	public void setNf(HashKnoten nf) {
		this.nf = nf;
	}

	public Nachrichtenzeiger getNzKopf() {
		return nzKopf;
	}

	public void setNzKopf(Nachrichtenzeiger nzKopf) {
		this.nzKopf = nzKopf;
	}

	// TODO AUFGABE 1c
	public HashKnoten(String hashtag, Nachricht nachricht) {
		// Implementieren Sie hier Ihre Loesung
	}

	// TODO AUFGABE 1d
	public void fuegeNachrichtEin(Nachricht nachricht) {
		// Implementieren Sie hier Ihre Loesung
	}
}
