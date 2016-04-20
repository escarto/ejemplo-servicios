package com.mycompany.servicios_ejemplo1.paquete;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class Programa {

    public static void main(String main[]){

        Mesa mesa = new Mesa();

        Cocinero procesoCocinero = new Cocinero(mesa);
        Mensajero procesoMensajero = new Mensajero(mesa);
        
        procesoCocinero.start();

        procesoMensajero.start();
        

    }

}
