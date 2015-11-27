/**
 * Created by:
 * Institut für Informatik und Wirtschaftsinformatik, Universität Duisburg-Essen
 * <p>
 * For learning purpose only.
 * <p>
 * Solved/Edited by Oppa Hansi. Possible solution - there are other ways to
 * solve these tasks.
 */

package com.oppahansi.ws1516.mp.mp3;

public class Train {

   // Kann für die Ausgabe verwendet werden
   private static final String LOCOMOTIVE = "<___|o|";

   private Waggon head;

   public int getSize() {
      if (getHead() == null) {
         return 0;
      }
      else {
         return countWaggons();
      }
   }

   private int countWaggons() {
      Waggon currentWaggon = getHead();
      int size = 0;

      while (currentWaggon != null) {
         size++;
         currentWaggon = currentWaggon.getNext();
      }

      return size;
   }

   public int getPassengerCount() {
      if (getSize() == 0) {
         return 0;
      }
      else {
         return countPassengers();
      }
   }

   private int countPassengers() {
      Waggon currentWaggon = getHead();
      int passengersSum = 0;

      while (currentWaggon != null) {
         passengersSum += currentWaggon.getPassengers();
         currentWaggon = currentWaggon.getNext();
      }

      return passengersSum;
   }

   public int getCapacity() {
      if (getSize() == 0) {
         return 0;
      }
      else {
         return calculateCapacity();
      }
   }

   private int calculateCapacity() {
      Waggon currentWaggon = getHead();
      int capacity = 0;

      while (currentWaggon != null) {
         capacity += currentWaggon.getCapacity();
         currentWaggon = currentWaggon.getNext();
      }

      return capacity;
   }

   public void appendWaggon(Waggon waggon) {
      if (getHead() == null) {
         setHead(waggon);
      }
      else {
         getLastWaggon().setNext(waggon);
      }
   }

   private Waggon getLastWaggon() {
      Waggon currentWagon = getHead();

      while (currentWagon.getNext() != null) {
         currentWagon = currentWagon.getNext();
      }

      return currentWagon;
   }

   public void boardPassengers(int numberOfPassengers) {
      if (getHead() != null && numberOfPassengers > 0) {
         Waggon currentWaggon = getFirstWaggonWithFreeSlots();

         while (currentWaggon != null) {
            if (numberOfPassengers > 0) {
               int freeSlots = currentWaggon.getCapacity() - currentWaggon.getPassengers();

               if (freeSlots >= numberOfPassengers) {
                  currentWaggon.setCapacity(currentWaggon.getCapacity() + numberOfPassengers);
                  break;
               }
               else {
                  currentWaggon.setCapacity(currentWaggon.getCapacity());
                  numberOfPassengers -= freeSlots;
               }
            }
            else {
               break;
            }

            currentWaggon = currentWaggon.getNext();
         }
      }
   }

   private Waggon getFirstWaggonWithFreeSlots() {
      Waggon currentWaggon = getHead();

      while (currentWaggon != null) {
         if (currentWaggon.getCapacity() - currentWaggon.getPassengers() > 0) {
            return currentWaggon;
         }

         currentWaggon = currentWaggon.getNext();
      }

      return null;
   }

   public Train uncoupleWaggons(int index) {
      return new Train();
   }

   public void insertWaggon(Waggon waggon, int index) {
   }

   public void turnOver() {
   }

   public void removeWaggon(Waggon waggon) {
   }

   public Waggon getWaggonAt(int index) {
      return null;
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

   public Waggon getHead() {
      return head;
   }

   public void setHead(final Waggon head) {
      this.head = head;
   }
}
