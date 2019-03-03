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
public class Lista {
    int tamaño;
    Nodo inicio;
    
    public Lista(){
        inicio = null;
        tamaño = 0;
    }
    
    public boolean es_vacia(){
        return this.inicio == null;
    }
    
    public void insertar_nodo_final(Nodo nodo){
        if (this.es_vacia()){
            inicio = nodo;
        }else{
            Nodo siguiente_ = inicio.getSiguiente();
            while(siguiente_ != null){
                siguiente_ = siguiente_.getSiguiente();
            }
            siguiente_.setSiguiente(nodo);
        }
        this.tamaño++;
    }
    
    public void Imprimir_Lista(){
        if (inicio != null){
            Nodo siguiente_ = inicio;
            do{
                System.out.println(siguiente_.getValor());
                siguiente_ = siguiente_.getSiguiente();
            }while(siguiente_ != null);
        }else{
            System.out.println("La Lista está vacía");
        }
        
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    
    
           
    
}
