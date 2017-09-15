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
    

    public Hamadriades(String nombre, int Altura, int edad) {
        super(nombre, Altura, edad);
        super.setSalud(546);
        super.setPoder(78);;
    }


    @Override
    public int atacar(Hada victima) {
        int vida;
        vida = victima.getSalud() - super.getPoder();
        return vida;
    }

}
