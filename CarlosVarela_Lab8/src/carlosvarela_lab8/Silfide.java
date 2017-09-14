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
public class Silfide extends Hada {

    private int Alas;

    public Silfide(int Alas, String nombre, int Altura, int edad) {
        super(nombre, Altura, edad);
        super.setSalud(563);
        super.setPoder(67);
        this.Alas = Alas;
    }

    public int getAlas() {
        return Alas;
    }

    public void setAlas(int Alas) {
        this.Alas = Alas;
    }
   
    
    @Override
    public int atacar(Hada victima) {
        int vida;
        if (victima instanceof Silfide) {
            vida = victima.getSalud() - 91;
            return vida;
        }else{
            vida = victima.getSalud() - super.getPoder();
            return vida;
        }
    }
    
}
