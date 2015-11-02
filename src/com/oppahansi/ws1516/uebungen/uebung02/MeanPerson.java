/**
 * Created by:
 * Institut für Informatik und Wirtschaftsinformatik, Universität Duisburg-Essen
 *
 * For learning purpose only.
 *
 * Solved/Edited by Oppa Hansi. Possible solution - there are other ways to
 * solve these tasks.
 */

package com.oppahansi.ws1516.uebungen.uebung02;

/*
 * ACHTUNG:
 * Sollten FEHLERMELDUNGEN bezueglich einer nicht vorhandenen Klasse Car
 * auftauchen, liegt das vermutlich daran, dass die Datei Car.java aus der
 * Aufgabe in JACK nicht korrekt integriert haben. Laden Sie dazu die Datei
 * Car.java runter und integrieren Sie diese mittels des Dialogs
 * Rechtsklick auf ihr Javaprojekt->Import...  ->  General->Filesystem
 * bzw
 * Rechtsklick auf ihr Javaprojekt->Import...  ->  Allgemein->Dateisystem
 * Suchen Sie in diesem Dialog die von Ihnen runtergeladene Datei, machen Sie
 * ein H�ckchen davor und bestaetigen Sie den Dialog.
 */

/* 
 * In dieser Aufgabe geht es darum mit verschachtelten Objekten zu arbeiten.
 * Die markierten Methoden der Klasse MeanPerson sollen von Ihnen implementiert
 * werden.
 * Die Loesung dieser Aufgabe erfordert die Kenntnis und Verwendung der
 * Klasse Car. Die Klasse Car soll jedoch NICHT bearbeitet werden.
 * Die Implementierungen der Klasse Car geben Ihnen vielleicht auch Ideen zur
 * Implementierung der Klasse MeanPerson.
 * 
 * Hinweis: Beruecksichtigen Sie Faelle in denen eine Person keinen Freund
 * oder kein Auto hat.
 */

public class MeanPerson {

   private Car favouriteCar;        // Lieblingsauto der Person
   private Car ownedCar;            // Eigenes Auto der Person
   private MeanPerson friend;       // "Freund" der Person
   private int money;               // Kontostand der Person in Euro

	/*
	 * Hier BEGINNT der zu bearbeitende Bereich
	 */

   /*
    * Ergaenzen Sie den Konstruktor so, dass eine neue Person 10.000 Euro
    * besitzt. Sollte es Ihnen notwendig oder geschickt erscheinen, koennen
    * Sie auch weitere Initialisierungen im Konstruktor vornehmen.
    */
   public MeanPerson() {

   }

   /*
    *  Diese Methode soll einen String zuruegeben, der Hersteller und Modell
    *  des eigenen Autos in der folgenden Form zurueck gibt:
    *               "Hersteller Modell"
    * Ist zB der Hersteller "Ludolf" und das Modell "Rostlaube 500" so soll die
    * Ausgabe "Ludolf Rostlaube 500" sein.
    */
   public String ownedCar() {
      return null;
   }

   /*
    * Diese Methode soll, analog zur Methode ownedCar, einen String
    * zurueckgeben, der Hersteller und Namen des Lieblingsautos enthaelt.
    */
   public String favouriteCar() {
      return null;
   }

   /*
    * Diese Methode soll, analog zu den Methoden ownedCar und favouriteCar,
    * einen String zurueckgeben, der Hersteller und Namen des Autos des
    * Freundes enthaelt.
    */
   public String friendsCar() {
      return null;
   }

   /*
    * Diese Methode soll wahr(true) zurueck geben, wenn die Person gluecklich
    * ist, sonst falsch(false).
    * Die Person ist genau dann gluecklich, wenn Sie ihr Lieblingsauto besitzt
    * und dieses nicht beschaedigt ist.
    */
   public boolean isHappy() {
      return false;
   }

   /*
    * Diese Methode soll wahr(true) zurueck geben, wenn die Person neidisch auf
    * ihren Freund ist, sonst falsch(false).
    * Die Person ist genau dann neidisch auf ihren Freund, wenn
    * der Freund ein wertvolleres Auto hat.
    * Hat die Person jedoch ihr Lieblingsauto und dieses ist unbeschaedigt, ist
    * sie auf keinen Fall neidisch.
    * (HINWEIS: Die letzte Bedingung taucht woanders schon auf!)
    */
   public boolean isEnvious() {
      return true;
   }

   /*
    * Diese Methode soll wahr(true) zurueck geben, wenn sich die Person
    * insgeheim ueber das Auto des Freundes kaputt lacht, sonst falsch(false).
    * Die Person lacht sich genau dann ueber das Auto des Freundes kaputt,
    * wenn das Auto des Freundes beschaedigt ist, oder der Hersteller des Autos
    * die Firma "Ludolf" ist.
    * (HINWEIS: Zur Loesung dieser Aufgabe benoetigen Sie die
    * Java-Standardmethode compareTo der Klasse String. Googeln Sie nach
    * "java string compareto", falls Sie die Methode nicht schon kennen
    */
   public boolean secretlyLaughsOverFriendsCar() {
      return false;
   }

   /*
    * In dieser Methode soll die Person ihr Auto reparieren.
    * Die Kosten der Reparatur sollen vom Geld der Person abgezogen werden.
    */
   public void repairCar() {

   }

   /*
    * Mit dieser Methode soll die Person ein neues, als Parameter uebergebenes
    * Auto erweben. Falls die Person ein altes Auto hat, wird dieses fuer den
    * aktuellen Wert in Zahlung gegeben. Sollte die Person ihr Konto fuer den
    * Handel ueberziehen muessen, darf der Handel nicht stattfinden und die
    * Person behaelt ihr altes Auto. Findet der Handel statt, soll das als
    * Parameter uebergebene Auto das neue ownedCar sein.
    */
   public void buyNewCar(Car newCar) {

   }
	
	/*
	 * Hier ENDET der zu bearbeitende Bereich
	 */

   // Getter und Setter fuer die Klasse Person.
   // Die Getter und Setter sind bereits vollstaendig implementiert
   // und sollen fuer die Aufgabe NICHT veraendert werden!

   public void setFavouriteCar(Car newFavouriteCar) {
      favouriteCar = newFavouriteCar;
   }

   public Car getFavouriteCar() {
      return favouriteCar;
   }

   public void setOwnedCar(Car newOwnedCar) {
      ownedCar = newOwnedCar;
   }

   public Car getOwnedCar() {
      return ownedCar;
   }

   public void setFriend(MeanPerson newFriend) {
      friend = newFriend;
   }

   public MeanPerson getFriend() {
      return friend;
   }

   public void setMoney(int newMoney) {
      money = newMoney;
   }

   public int getMoney() {
      return money;
   }

   // Testen Sie hier ob ihre Methoden wie gewuenscht funktionieren!

   /**
    * Main-Methode angepasst von Oppahansi.
    */
   public static void main(String[] args) {
      MeanPerson person = new MeanPerson();
      MeanPerson friend = new MeanPerson();
      Car personsCar = new Car();
      Car friendsCar = new Car();
      Car newCar = new Car();

      personsCar.setManufacturer("Audi");
      personsCar.setModel("A3");
      personsCar.setValue(15000);

      newCar.setValue(25000);

      person.setOwnedCar(personsCar);
      person.setFavouriteCar(personsCar);
      friend.setOwnedCar(friendsCar);
      friend.setFavouriteCar(friendsCar);
      person.setFriend(friend);

      System.out.println("Person hat das Auto: " + person.ownedCar() + "  (Richtig: Audi A3)");
      System.out.println("Person ist gluecklich: " + person.isHappy() + " (Richtig: true)");
      System.out.println("Person ist eifersuechtig: " + person.isEnvious() + " (Richtig: false)");
      System.out.println("Person lacht ueber Freund: " + person.secretlyLaughsOverFriendsCar() + " (Richtig: true)\n");
      person.getOwnedCar().crash();

      System.out.println("Persons Auto hatte einen Crash.");
      System.out.println("Auto wird repariert.\nKontostand vor Reparatur: " + person.getMoney() + " (Richtig: 10000)");
      person.repairCar();
      System.out.println("Kontostang nach Reparatur: " + person.getMoney() + " (Richtig: 2500)\n");

      System.out.println("Person moechte ein neues Auto. Kosten 25000");
      person.buyNewCar(newCar);
      System.out.println("Autokauf moeglich: " + person.getOwnedCar().getManufacturer().contains("Ludolf") + " (Richtig: false)");
   }

}
