/**
 * Created by:
 * Institute for Computer Science and Business Information Systems
 * University Duisburg-Essen
 *
 * For learning purpose only.
 *
 * Offizielle moegliche Loesung
 */

package com.oppahansi.ws1415.uebungsblatt10;

class Kante {

  String bez;
  Kante nf;
  Knoten ziel;

  Kante(Knoten ziel, String bez) {
    this.bez = bez;
    nf = null;
    this.ziel = ziel;
  }
}
