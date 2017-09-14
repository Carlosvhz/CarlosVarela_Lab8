/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosvarela_lab8;

import java.io.Serializable;

/**
 *
 * @author carlo
 */
public class Arbol implements Serializable{
    
    private int Salud;
    
    public Arbol(){
        this.Salud = 173;
    }
    
    public int getSalud() {
        return Salud;
    }

    public void setSalud(int Salud) {
        this.Salud = Salud;
    }
    
}
