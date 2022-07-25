/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author LENOVO
 */
public class Nombramiento extends Docente{
    private double valorSueldo;
    private double valorPorHora;
    private int numHoras;
    private double sueldo;

    public void establecerValorSueldo(double vs){
        valorSueldo = vs;
    }
    public void establecerValorPorHora(double valorxH){
        valorPorHora = valorxH;
    }
    public void establecerNumHoras(int num){
        numHoras = num;
    }
    public void establecerSueldo(){
        sueldo = (valorPorHora * numHoras) + valorSueldo;
    }

    public double obtenerValorSueldo(){
        return valorSueldo;
    }
    public double obtenerValorPorHora(){
        return valorPorHora;
    }
    public int obtenerNumHoras(){
        return numHoras;
    }
    public double obtenerSueldo(){
        return sueldo;
    }

    @Override
    public String toString() {
        String c = "******Docente con Nombramiento******";
        c = String.format("%s\nNombre: %s\nCedula: %s\n\n"
                        + "Sueldo del Docente: %.2f\n"
                        + "Valor del sueldo por hora: %.2f\n"
                        + "Numero de horas trabajadas: %d\n\n"
                        + "Total a del sueldo resivido: %.2f\n"
                , c
                , nombre
                , obtenerCedula()
                , obtenerSueldo()
                , valorPorHora
                , obtenerNumHoras()
                , obtenerSueldo()
        );
        return c;
    }
}
