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
public class Lamia extends Hada {
    
    private int aletas, branquias;
    private boolean aumentoPoder;

    public Lamia(String nombre, int Altura, int edad, int aletas, int branquias) {
        super(nombre, Altura, edad);
        super.setSalud(475);
        super.setPoder(57);
        this.aumentoPoder = true;
        this.aletas = aletas;
        this.branquias = branquias;
        this.aumentoPoder = aumentoPoder;
    }

    

    public int getAletas() {
        return aletas;
    }

    public void setAletas(int aletas) {
        this.aletas = aletas;
    }

    public int getBranquias() {
        return branquias;
    }

    public void setBranquias(int branquias) {
        this.branquias = branquias;
    }

    public boolean isAumentoPoder() {
        return aumentoPoder;
    }

    public void setAumentoPoder(boolean aumentoPoder) {
        this.aumentoPoder = aumentoPoder;
    }

    @Override
    public int atacar(Hada victima) {
        int vida;
        if (victima instanceof Salamandra) {   
            vida = victima.getSalud() - 81;
            return vida;
        }else{
            vida = victima.getSalud() - super.getPoder();
            return vida;
        }
    }
    
}
