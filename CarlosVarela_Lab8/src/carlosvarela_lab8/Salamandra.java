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
public class Salamandra extends Hada {

    private int alas;

    public Salamandra(int alas, String nombre, int Altura, int edad) {
        super(nombre, Altura, edad);
        super.setSalud(683);
        super.setPoder(71);
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public int atacar(Hada victima) {
        int vida;
        if (victima instanceof Hamadriades) {
            vida = victima.getSalud() - 121;
            return vida;
        }else{
            vida = victima.getSalud() - super.getPoder();
            return vida;
        }
    }
    
}
