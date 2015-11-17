package com.oppahansi.ss14.klausurss14Aufg1;

/*
 * ANMERKUNG BITTE LESEN
 * 
 * Diese Klausurl�sungen wurden nicht von mir (oppahansi) erstellt, 
 * sondern von einem Kommilitonen - Khoa Trinh -
 * 
 * Falls ich hier einige Sachen im nachhinein ver�ndere, werde ich es
 * auch kommentieren!
 * 
 * Ein Dankesch�n an Khoa Trinh.
 */

public class Train {
    private Coach firstCoach;
    private Coach lastCoach;

    public void append(Coach coach) {
        // Teilaufgabe a)
        /*
         * Wie �ndert sich die Liste von der Datenstruktur her,
		 * wenn die append methode ausgef�hrt wird?  ( 6 punkte )
		 * 
		 * Im Falle, dass die Liste leer ist, wird der firstCoach und 
		 * der lastCoach  gleich dem einzuf�genden "coach" gesetzt und
		 * die liste ist genau 1 element lang. Im falle, dass die liste 
		 * nicht leer ist, wird der einzuf�gende coach an das ende der liste 
		 * eingef�gt und die liste wird um 1 element gr��er.
		 */

        if (firstCoach == null) {
            firstCoach = coach = lastCoach;
        } else {
            Coach node = firstCoach;
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(coach);
        }
    }

    // Hilfsmethode um bestimmten Coach anhand einer Position zu kriegen
    public Coach getCoachAt(int index) {
        if (index >= 0) {
            Coach node = firstCoach;
            for (int curPos = 0; curPos < index && node != null; curPos++) {
                node = node.getNext();
            }
            return node;
        } else {
            return null;
        }
    }

    /*
     * Teilaufgabe b)
     *
     * Implementiere die getPassengers Methode so, dass sie die Anzahl aller
     * Passagiere vom Zug wiedergibt. ( 6 Punkte )
     */
    public int getPassengers() {
        int sum = 0;
        Coach node = firstCoach;
        while (node != null) {
            sum = sum + node.getPassengers();
            node = node.getNext();
        }
        return sum;
    }

    /*
     * Teilaufgabe c)
     *
     * Implementiere die split Methode so, dass sie den Zug abkoppelt und die Elemente
     * im train, die NACH der Variable position vorkommen, in einen zweiten Zug einf�gt
     * ( 12 punkte )
     */
    public void split(int position) {
        Train train = new Train();
        Coach node = firstCoach;
        int counter = 1;
        while (node != null && counter < position) {
            counter++;
            node = node.getNext();
        }
        Coach node1 = node;
        while (node1 != null) {
            train.append(node);
            node = node.getNext();
        }
    }
	
	/*
	 * Teilaufgabe d)
	 * 
	 * Zeichne den neuen Zug, der dadurch entstanden ist, vorher und nachher. ( 6 punkte )
	 * 
	 * Hier muss ich erw�hnen, dass die train Klasse nat�rlich eine main Methode hatte,
	 * die 5 Elemente an den train angeh�ngt hat, man sollte hier einfach den Zustand
	 * des trains VOR der Ausf�hrung der Methode split(2) zeichnen, und einmal nach der 
	 * Ausf�hrung der methode split(2), also der neue Zug fing einfach ab Element 3 an.
	 * Vorher nat�rlich einfach den Zug mit den 5 Elementen aufzeichnen.
	 */

    /*
     * Teilaufgabe e)
     *
     * Wir haben ein int[] passengers array, das wir mit der Liste vergleichen sollen.
     * Hat das array mehr Zellen als die Liste, return false, hat die Liste in einem Waggon
     * weniger freien Platz (50 ist die Kapazit�t) als im array, return false. Sonst true .( 12 punkte )
     *
     * Hier muss ich vorbemerkt sagen, dass die folgende L�sung meine eigene ist und ich daf�r nur die H�lfte
     * der Punktzahl erhalten habe, sie ist also unkomplett der Professor war leider auch nicht in der Lage,
     * sie mir korrekt zu l�sen, nutzt also meine L�sung als Denkansto�, ne Komplettl�sung hab ich hier
     * leider nicht, Programmierberatung etc. k�nnen weiterhelfen...
     */
    public boolean ListenAufgabe(int[] passengers) {
        for (int i = 0; i < passengers.length; i++) {
            Coach node = firstCoach;
            int counter = 0;
            int freeSpace = 50 - node.getPassengers();
            while (node != null) {
                if (passengers[i] > freeSpace) return false;

                node = node.getNext();
                counter++;
            }
            if (counter > passengers.length) return false;
        }
        return true;
    }

}