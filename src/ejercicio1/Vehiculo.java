/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*//**
 *
 * @author zunig
 */
package ejercicio1;


public class Vehiculo {
   
    protected String marca;
    protected int velocidadMaxima;
    
    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }
    public void mostrarInformacion() {
        System.out.println("Marca del vehículo: " + marca);
        System.out.println("Velocidad máxima: " + velocidadMaxima);
    }
}
