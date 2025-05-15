/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isabelcontreras_edt6;

/**
 *
 * @author micon
 */
public class Tarea6EDClase {
    public void aplicarDescuento(double precioProducto, int numProductos){     double total;
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
            total = precioProducto*DESCUENTO_VEINTE;
            mostrarTotalEnviado(total);
        }else {
            total = precioProducto*DESCUENTO_CINCO;
            mostrarTotalEnviado(total);
        }   

    }
    public static final double DESCUENTO_CINCO = 0.95;
    public static final double DESCUENTO_VEINTE = 0.8;

    public void mostrarTotalEnviado(double total) {
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
}
