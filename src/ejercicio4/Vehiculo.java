/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 *//**
 *
 * @author zunig
 */
package ejercicio4;

public class Vehiculo {
    
    protected String marca;
    
    public Vehiculo(String marca) {
        this.marca = marca;
    }
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
    }
}
