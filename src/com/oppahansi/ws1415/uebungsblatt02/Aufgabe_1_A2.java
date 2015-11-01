/**
 * Created by oppahansi on 06.11.2014.
 *
 * Eine mögliche Lösung für die Aufgabe 1 aus dem Uebungsblatt 2
 *
 * Alternative 2
 */

package com.oppahansi.ws1415.uebungsblatt02;

import java.util.Scanner;

public class Aufgabe_1_A2 {

  private final static int UNTERGRENZE_KLEIN = 96;
  private final static int OBERGRENZE_KLEIN = 123;
  private final static int UNTERGRENZE_GROSS = 64;
  private final static int OBERGRENZE_GROSS = 91;
  private static int buchstabenWertASCII;
  private static int buchstabenPosition;

  public static void main(String[] args) {
    System.out.println("Bestimmen der Position eines Buchstabens im Alphabet.");
    System.out.println("Bitte geben Sie einen Buchstaben(a-z|A-Z) ein, \ndessen Position im Alphabet Sie bestimmen moechten:");
    buchstabenWertASCII = (int) getBuchstabe();
    buchstabenPosition = getBuchstabenPositon(buchstabenWertASCII);

    if (buchstabenPosition < 0) {
      System.out.println("Ungültige Eingabe. Das Programm wird beendet.");
    }
    else {
      System.out.println("Die Postion des Buchstabens im Alphabet ist: " + buchstabenPosition + ".");
    }
  }

  private static char getBuchstabe() {
    Scanner eingabenScanner = new Scanner(System.in);
    String buchstabe = eingabenScanner.next();
    eingabenScanner.close();
    return buchstabe.charAt(0);
  }

  private static int getBuchstabenPositon(int buchstabenWertASCII) {
    if (buchstabenWertASCII > UNTERGRENZE_KLEIN && buchstabenWertASCII < OBERGRENZE_KLEIN) {
      return buchstabenWertASCII - UNTERGRENZE_KLEIN;
    }
    else if (buchstabenWertASCII > UNTERGRENZE_GROSS && buchstabenWertASCII < OBERGRENZE_GROSS) {
      return buchstabenWertASCII - UNTERGRENZE_GROSS;
    }
    else {
      return -1;
    }
  }
}
