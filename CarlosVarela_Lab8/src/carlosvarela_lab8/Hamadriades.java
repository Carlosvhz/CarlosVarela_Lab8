/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosvarela_lab8;

/**
 *
 * @author carlo
 */
public class Hamadriades extends Hada{
    
    private Arbol arbol;

    public Hamadriades(Arbol arbol, String nombre, int Altura, int edad, int salud, int poder) {
        super(nombre, Altura, edad, salud, poder);
        this.arbol = arbol;
    }

    public Arbol getArbol() {
        return arbol;
    }

    public void setArbol(Arbol arbol) {
        this.arbol = arbol;
    }

    @Override
    public int atacar(Hada victima) {
       
    }
    
    
}
