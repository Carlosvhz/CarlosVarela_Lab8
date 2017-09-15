/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosvarela_lab8;

import javafx.scene.control.ProgressBar;
import javax.swing.*;
/**
 *
 * @author carlo
 */
public class Pelea extends Thread{
    
    private Hada peleador, contrincante;
    private JProgressBar barra1, barra2;
    
    public Pelea(Hada peleador, Hada contrincante) {
        this.peleador = peleador;
        this.contrincante = contrincante;
    }

    public Pelea(Hada peleador, Hada contrincante, JProgressBar barra1, JProgressBar barra2) {
        this.peleador = peleador;
        this.contrincante = contrincante;
        this.barra1 = barra1;
        this.barra2 = barra2;
    }

    
    public Hada getPeleador() {
        return peleador;
    }

    public void setPeleador(Hada peleador) {
        this.peleador = peleador;
    }
    
    @Override
    public void run(){
        barra1.setMaximum(peleador.getSalud());
        barra2.setMaximum(contrincante.getSalud());
        try {
            while(peleador.getSalud()>0&&contrincante.getSalud()>0){
                contrincante.setSalud(peleador.atacar(contrincante));
                peleador.setSalud(contrincante.atacar(peleador));
                barra1.setValue(peleador.getSalud());
                barra2.setValue(contrincante.getSalud());
                Thread.sleep(2000);
            }
        } catch (Exception e) {
        }
        if (peleador.getSalud()<0) {
            JOptionPane.showMessageDialog(null, "Ganador hada "+peleador.getNombre());
        }else{
            JOptionPane.showMessageDialog(null, "Ganador hada "+contrincante.getNombre());
        }
    }
    
}
