package com.mycompany.servicios_ejemplo1.paquete;

import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class Cocinero extends Thread {

    Mesa mesa;

    public Cocinero(Mesa mesa) {
        this.mesa = mesa;
    }

    public void run() {

        while (true) {
           Random r = new Random();
           int metodo= r.nextInt(2);
        //   System.out.println("metodo " + metodo);

            if(((mesa.cantidadPU*10 + mesa.cantidadPD*15) <= 190 && metodo==0)||((mesa.cantidadPU*10 + mesa.cantidadPD*15) <= 185 && metodo==1)){
                    int tiempoCocinando = (int) (Math.random() * 10);
              // System.out.println("Cocinero preparando comida por " + tiempoCocinando + " segundos");

               try {
                   sleep(tiempoCocinando * 1000);
               } catch (InterruptedException e) {
               }

             if(metodo==0){
                 mesa.colocarProductoU();
                // System.out.println("cantidad producto U "+ mesa.cantidadPU);
                 
             }  else{
                 mesa.colocarProductoD();
              //    System.out.println("cantidad producto D "+ mesa.cantidadPD);
             }
                 
            }
            else{
                //System.out.println("mesa llena");
            }
          

        }
    }
}
