package com.oppahansi.ss14.miniprojekt3;

public class Train {

    // Kann für die Ausgabe verwendet werden
    private static final String LOCOMOTIVE = "<___|o|";

    private Waggon head;

    public int getSize() {
        if (this.head == null) {
            return 0;
        } else {
            int counter = 0;
            Waggon node = this.head;
            while (node != null) {
                counter++;
                node = node.getNext();
            }
            return counter;
        }
    }

    public int getPassengerCount() {
        if (this.head == null) {
            return 0;
        } else {
            int counter = 0;
            Waggon node = this.head;
            while (node != null) {
                counter += node.getPassengers();
                node = node.getNext();
            }
            return counter;
        }
    }

    public int getCapacity() {
        if (this.head == null) {
            return 0;
        } else {
            int counter = 0;
            Waggon node = this.head;
            while (node != null) {
                counter += node.getCapacity();
                node = node.getNext();
            }
            return counter;
        }
    }

    public void appendWaggon(Waggon waggon) {
        if (this.head == null || waggon == null || this.getSize() == 0) {
            this.head = waggon;

        } else {
            Waggon node = this.head;
            int size = this.getSize();
            for (int i = 1; i < size; i++) {
                node = node.getNext();
            }
            node.setNext(waggon);
        }
    }

    public void boardPassengers(int numberOfPassengers) {
        Waggon node = this.head;
        int passengersTo = numberOfPassengers;
        while (node != null) {
            int capacity = node.getCapacity();
            int in = node.getPassengers();
            int free = capacity - in;

            if (free == 0) {
                node = node.getNext();
                continue;

            } else if (free >= passengersTo) {
                node.setPassengers(in + passengersTo);
                break;

            } else if (free < passengersTo) {
                node.setPassengers(in + free);
                passengersTo -= free;
            }
            node = node.getNext();
        }
    }

    public Train uncoupleWaggons(int index) {
        if (index < 0 || index > this.getSize()) {
            return null;
        } else {
            Train newTrain = new Train();    //neuen Zug erstellen
            Waggon node = this.getWaggonAt(index - 1);    //Waggon an der Stelle index -1 den letzten vom zug
            Waggon next = node.getNext();
            node.setNext(null);
            newTrain.head = next;
            return newTrain;
        }
    }

    public void insertWaggon(Waggon waggon, int index) {
        if (waggon == null || index < 0) {

        } else if (index == 0)        //falls index 0 ist, der neue Waggon muss an die erste Stelle
        {
            Waggon next = this.head;
            this.head = waggon;
            head.setNext(next);

        } else if (index >= this.getSize()) {
            Waggon node = this.getWaggonAt(this.getSize() - 1);
            node.setNext(waggon);

        } else {
            Waggon previous = this.getWaggonAt(index - 1);
            Waggon next = this.getWaggonAt(index);
            previous.setNext(waggon);
            waggon.setNext(next);
        }
    }

    public void turnOver() {
        Waggon newHead = this.getWaggonAt(this.getSize() - 1);    //letzte Stelle des aktuellen Zuges
        Train newTrain = new Train();
        while (this.getSize() > 0) {
            newHead = this.getWaggonAt(this.getSize() - 1);
            newTrain.appendWaggon(newHead);
            this.removeWaggon(newHead);
        }
        this.head = newTrain.getWaggonAt(0);
    }

    public void removeWaggon(Waggon waggon) {
        if (waggon == null) {

        } else {
            if (this.head == waggon) {
                this.head = this.head.getNext();

            } else {
                Waggon node = this.head;
                while (node != null && node.getNext() != waggon) {
                    node = node.getNext();
                }

                if (node != null) {
                    node.setNext(node.getNext().getNext());
                }
            }
        }
    }

    public Waggon getWaggonAt(int index) {
        if (index < 0 || index > this.getSize()) {
            return null;

        } else {
            Waggon node = this.head;
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
            return node;
        }
    }

    @Override
    public String toString() {
        if (getSize() == 0) {
            return LOCOMOTIVE;
        }

        StringBuilder str = new StringBuilder(LOCOMOTIVE);

        Waggon pointer = head;
        while (pointer != null) {
            str.append(" <---> ");
            str.append(pointer.getName());
            pointer = pointer.getNext();
        }

        return str.toString();
    }

}

