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

public class Node {
    private int number;
    private Node nextLeft;
    private Node nextRight;

    public Node(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getNextLeft() {
        return nextLeft;
    }

    public void setNextLeft(Node node) {
        nextLeft = node;
    }

    public Node getNextRight() {
        return nextRight;
    }

    public void setNextRight(Node node) {
        nextRight = node;
    }
}