/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 *//**
 *
 * @author zunig
 */
package ejercicio4;

public class Muebles extends Coche, Vehiculo {
    
    protected String estilo;
    
    public Muebles(String marca, String modelo, String estilo) {
        super( marca, modelo);
        this.estilo = estilo;
    }
    @Override
    public void mostrarDetalles() { 
        super.mostrarDetalles();
        System.out.println("Estilo: " + estilo);
    }
}
