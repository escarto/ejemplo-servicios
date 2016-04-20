package com.mycompany.servicios_ejemplo1.paquete;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class Mensajero extends Thread {

    Mesa mesa;

    public Mensajero(Mesa mesa){
        this.mesa = mesa;
    }

    public void run(){
        
        while(true){
           // System.out.println("paqueteeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            if(mesa.cantidadPU>2 && mesa.cantidadPD>3){
                         
                       mesa.atenderPedido();
                       System.out.println("paquete armado"+ mesa.cantidadPU+"d "+ mesa.cantidadPD);
/*
                        int tiempoEntregando = (int) (Math.random() * 10);
                        try {
                            sleep(tiempoEntregando * 100);
                        } catch (InterruptedException e) {
                        }
*/
            }
         

        }

    }

}
