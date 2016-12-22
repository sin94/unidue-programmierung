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

public class Nachricht {

	private int id;
	private String inhalt;
	private String verfasser;
	private String[] hashTags;
	private Nachricht referenz;

	public int getId() {
		return id;
	}

	public String getInhalt() {
		return inhalt;
	}

	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}

	public String getVerfasser() {
		return verfasser;
	}

	public void setVerfasser(String verfasser) {
		this.verfasser = verfasser;
	}

	public String[] getHashTags() {
		return hashTags;
	}

	public void setHashTags(String[] hashTags) {
		this.hashTags = hashTags;
	}

	public Nachricht getReferenz() {
		return referenz;
	}

	public void setReferenz(Nachricht referenz) {
		this.referenz = referenz;
	}

	// TODO AUFGABE 1a
	public Nachricht(String verfasser, String inhalt, int id) {
		// Implementieren Sie hier Ihre Loesung
	}
}
