package com.mycompany.servicios_ejemplo1.paquete;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daniel
 */
public class Mesa {

    int cantidadPU;
    int cantidadPD;

    public Mesa() {
        cantidadPU = 4;
        cantidadPD=5;
    }

    public void colocarProductoU() {
        cantidadPU = cantidadPU + 1;
    }
    public void colocarProductoD() {
        cantidadPD = cantidadPD + 1;
    }
    public void atenderPedido() {
        cantidadPU = cantidadPU - 3;
        cantidadPD= cantidadPD- 4;
    }
}
