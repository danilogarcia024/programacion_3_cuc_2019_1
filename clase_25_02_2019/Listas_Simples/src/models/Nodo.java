/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author invitado
 */
public class Nodo {
    private String valor;
    private Nodo siguiente;
    
    /* 
        Alt + Insert
        Para insertar Getter and Setter en Netbeans y otros métodos
    */
    
    public Nodo(){
        this.valor = "";
        this.siguiente = null;
    }
    
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
