package com.oppahansi.ss14.klausurss14Aufg2;

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

public class Tree {

    private Node root;

    /*
     * Teilaufgabe a)
     */
    // Parameter von Node node zu int number ge�ndert (oppahansi)
    public void add(int number) {
    /*
     * Diese Methode hab ich auch nicht im kopf, aber ich wei� genau, 
     * dass sie vorzugsweise den Node immer in den linken teilbaum
     * eingef�gt hat, wenn beide teilb�ume dann wieder die selbe minHeight
     * haben wurde wieder vorzugsweise links eingef�gt, und die selbe
     * Geschichte wiederholt.
     */

        // hier L�sung implementieren

    }

    public int getMinHeight() {
        /*
         * Diese methode war auch vorgegeben, ich hab sie zwar nicht mehr im kopf,
    	 * aber sie hat die mindesth�he vom Knoten bis zur Wurzel zur�ckgegeben
    	 */
        int minHeight = 0;
        return minHeight;
    }
   
    /*
     * Teilaufgabe b)
     * 
     * Zeichne den baum nach Ausf�hrung der main Methode. ( 6 punkte )
     * 
     * so w�rde unser beispielbaum nach ausf�hrung dieser methode aussehen:
	// so w�rde dieser baum aussehen
    //                            10
    //                         /     \
    //                        6      33
    //                       / \    /  \
    //                     7   45  1  
     */

    /*
     * Teilaufgabe c)
     * 
     * Zeichne den baum nach ausf�hrung der main methode ( 6 punkte )
     */
    public void print() {
        print(root);
    }

    private void print(Node node) {
        // hier den baum aus der postorder zur�ckgeben,
        // also erst den rechten teilbaum, dann den linken, dann die wurzel
        if (node != null) {

            print(node.getNextRight());
            print(node.getNextLeft());
            System.out.println(node.getNumber());
        }
        // f�r unseren beispielbaum w�ren es die werte :
        //  1 , 33 , 7, 45 , 6 , 10
    }


    /*
     * Teilaufgabe d)
     *
     * Implementiere die Methode countNodesLargerThan10 so,
     * dass sie  die Anzahl an Knoten gr��er als 10 rausgibt ( 12 punkte )
     */
    public void countNodesLargerThan10() {
        countNodesLargerThan10(root);
    }

    public int countNodesLargerThan10(Node node) {
        if (node == null) return 0;
        int counter = 0;
        if (node.getNumber() > 10)
            counter++;

        counter = counter + countNodesLargerThan10(node.getNextLeft());
        counter = counter + countNodesLargerThan10(node.getNextRight());
        return counter;
    }

    /*
     * Teilaufgabe e)
     * 
     * Implementiere die methode makeParentsProducts so, 
     * dass sie den node um�ndert in das produkt seiner beiden kindknoten.
     */
    public void makeParentsProducts() {
        makeParentsProducts(root);
    }

    public int makeParentsProducts(Node node) {
        if (node == null) return 1;
        node.setNumber(makeParentsProducts(node.getNextRight()) * makeParentsProducts(node.getNextLeft()));
        return node.getNumber();
    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(10);
        tree.add(6);
        tree.add(33);
        tree.add(7);
        tree.add(45);
        tree.add(1);
    }

}
