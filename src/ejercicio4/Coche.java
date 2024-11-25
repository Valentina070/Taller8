/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 *//**
 *
 * @author zunig
 */
package ejercicio4;

public class Coche extends Vehiculo {
    protected String modelo;
    
    
    public Coche(String modelo) {
        super(modelo);
        this.modelo = modelo;
        
    }
    @Override
    public void mostrarDetalles() { 
        super.mostrarDetalles();
        System.out.println("Modelo: " + modelo);
    }
}
