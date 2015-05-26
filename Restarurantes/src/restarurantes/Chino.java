/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restarurantes;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Chino extends Restarurante{

    private static int totalChinos;
    private ArrayList<Trabajador> trabajadoresChino = new ArrayList<Trabajador>();

    public Chino() {
        totalChinos++;
    }

    public Chino(String nombre, String propietario, String domicilio) {
        super(nombre, propietario, domicilio);
        totalChinos++;
    }

    public static int getTotalChinos() {
        return totalChinos;
    }

    public static void setTotalChinos(int totalChinos) {
        Chino.totalChinos = totalChinos;
    }

    public ArrayList<Trabajador> getTrabajadoresChino() {
        return trabajadoresChino;
    }

    public void setTrabajadoresChino(ArrayList<Trabajador> trabajadoresChino) {
        this.trabajadoresChino = trabajadoresChino;
    }

     @Override
    public String mostrarInformacion() {
        return "Chino{" + "trabajadoresChino=" + trabajadoresChino + '}';
    }
   

}
