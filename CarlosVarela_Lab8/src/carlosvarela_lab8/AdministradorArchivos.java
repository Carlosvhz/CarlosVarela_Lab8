/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosvarela_lab8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class AdministradorArchivos {
    
    private ArrayList<Hada> hadas = new ArrayList();

    public AdministradorArchivos() {
    }

    public ArrayList<Hada> getHadas() {
        return hadas;
    }

    public void setHadas(ArrayList<Hada> hadas) {
        this.hadas = hadas;
    }
    
    public void guardar(File archivo){
        FileOutputStream fo = null;
        ObjectOutputStream ob = null;
        try {
            fo = new FileOutputStream(archivo);
            ob = new ObjectOutputStream(fo);
            for (Hada hada : hadas) {
                ob.writeObject(hada);
            }
            ob.flush();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Surgio un problema");
            e.printStackTrace();
        }
        try {
            fo.close();
            ob.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Surgio un problema");
            e.printStackTrace();
        }
    }
    
    public ArrayList abrir(File archivo){
        FileInputStream fi = null;
        ObjectInputStream ob = null;
        ArrayList<Hada> hadas = new ArrayList();
        try {
            fi = new FileInputStream(archivo);
            ob = new ObjectInputStream(fi);
            while(true){
                hadas.add((Hada)ob.readObject());
            }
        } catch (Exception e) {            
        }
        try {
            fi.close();
            ob.close();
        } catch (Exception e) {
        }
        return hadas;
    }
}
