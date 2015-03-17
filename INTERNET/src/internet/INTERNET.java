/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internet;
import java.net.*;
import java.io.*;

/**
 *
 * @author DAM1
 */
public class INTERNET {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws Exception {
        URL laPagina = new URL("https://es.wikipedia.org/wiki/Rep%C3%BAblica_Sovi%C3%A9tica_H%C3%BAngara");
        URLConnection laPaginaConnection = laPagina.openConnection();
        BufferedReader lectorBuffer = new BufferedReader(
                                new InputStreamReader(
                                laPaginaConnection.getInputStream()));
        String lineaDeEntrada;

        while ((lineaDeEntrada = lectorBuffer.readLine()) != null) 
            System.out.println(lineaDeEntrada);
        lectorBuffer.close();
    }
}