/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author invitado
 */
public class Linked_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList linkedlist = new LinkedList();
        linkedlist.add("A");
        linkedlist.add("B");
        linkedlist.add("C");
        linkedlist.add("D");
        linkedlist.add("E");
        linkedlist.add("F");
        linkedlist.add("G");
        linkedlist.add("H");
        linkedlist.add("I");
        linkedlist.add("J");
        linkedlist.add("A");
        linkedlist.add("A");
        linkedlist.add("A");
        
        for(int i=0;i<linkedlist.size();i++){
            System.out.println("Posición (" + (i+1) + "): "+linkedlist.get(i));
        }
        
        System.out.println("--------------------------------------------------");
        
        Iterator iterador = linkedlist.descendingIterator();
        int tamanio = linkedlist.size();
        while(iterador.hasNext()){
            System.out.println("Posición ("+tamanio+"): " + iterador.next());
            tamanio--;
        }
        
        System.out.println("--------------------------------------------------");
        
        /*Se quita el primer Elemento A*/
        linkedlist.removeFirstOccurrence("A");
        
        /*Mostremos nuevamente la lista*/
        for(int i=0;i<linkedlist.size();i++){
            System.out.println("Posición (" + (i+1) + "): "+linkedlist.get(i));
        }
        
        System.out.println("--------------------------------------------------");
        
        /*
            Vamos a quitar el último elemento, la lista como una Cola
            El elemento que se quitará será: A (Una)
        */
        System.out.println("Elemento que se borra de cola: " + linkedlist.pop());
        
        /*Mostremos nuevamente la lista*/
        for(int i=0;i<linkedlist.size();i++){
            System.out.println("Posición (" + (i+1) + "): "+linkedlist.get(i));
        }
        
        System.out.println("--------------------------------------------------");
        
        /*
            Vamos a comportar la lista como una Pila
            Vamos a quitar el elemento: A
        */
        System.out.println("Elemento que se borra de pila: " + linkedlist.pollLast());
        
        /*Mostremos nuevamente la lista*/
        for(int i=0;i<linkedlist.size();i++){
            System.out.println("Posición (" + (i+1) + "): "+linkedlist.get(i));
        }
    }
    
}
