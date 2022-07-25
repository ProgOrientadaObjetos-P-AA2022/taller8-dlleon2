/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author LENOVO
 */
public class DocenteFactura extends Docente{
    private double valorFactura;
    private double valorIva;
    private double valorCancelado;

    public void establecerValorFactura(double vf){
        valorFactura = vf;
    }
    public void establecerValorIva(double vi){
        valorIva = vi;
    }
    public void establecerValorCancelado(){
        valorCancelado = valorFactura - (valorFactura * (valorIva / 100));
    }

    public double obtenerValorFactura(){
        return valorFactura;
    }
    public double obtenerValorIva(){
        return valorIva;
    }
    public double obtenerValorCancelado(){
        return valorCancelado;
    }

    @Override
    public String toString() {
        String c = "******Docente con factura******";
        c = String.format("%s\nNombre: %s\nCedula: %s\n\n"
                        + "Valor de factura: %.2f\n"
                        + "Valor del iva: %.2f\n\n"
                        + "Total del valor a cancelar: %.2f\n"
                ,c
                ,nombre
                ,obtenerCedula()
                ,obtenerValorFactura()
                ,valorIva
                ,obtenerValorCancelado()
        );
        return c;
    }
}
