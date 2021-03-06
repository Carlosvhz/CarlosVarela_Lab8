package carlosvarela_lab8;

import java.io.Serializable;

public abstract class Hada implements Serializable{
    
    private String nombre;
    private int Altura, edad, salud, poder;

    public Hada(String nombre, int Altura, int edad){
        this.nombre = nombre;
        this.Altura = Altura;
        this.edad = edad;
    }
    public Hada(String nombre, int Altura, int edad, int salud, int poder) {
        this.nombre = nombre;
        this.Altura = Altura;
        this.edad = edad;
        this.salud = salud;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public abstract int atacar(Hada victima);
}
