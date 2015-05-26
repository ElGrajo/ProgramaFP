/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restarurantes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pizzeria extends Restarurante {

    private static int totalPizzerias;
    private ArrayList<Trabajador> trabajadoresPizzeria = new ArrayList<Trabajador>();

    public Pizzeria() {
        //lamada a super implicita!!
        totalPizzerias++;
    }

    public Pizzeria(String nombre, String propietario, String domicilio) {
        super(nombre, propietario, domicilio);
        totalPizzerias++;
    }

    public static int getTotalPizzerias() {
        return totalPizzerias;
    }

    public static void setTotalPizzerias(int totalPizzerias) {
        Pizzeria.totalPizzerias = totalPizzerias;
    }

    public ArrayList<Trabajador> getTrabajadoresPizzeria() {
        return trabajadoresPizzeria;
    }

    public void setTrabajadoresPizzeria(ArrayList<Trabajador> trabajadoresPizzeria) {
        this.trabajadoresPizzeria = trabajadoresPizzeria;
    }

    @Override
    public String mostrarInformacion() {
//llamada a super??
        return "Pizzeria{" + "trabajadoresPizzeria=" + trabajadoresPizzeria + '}';
    }   
}
