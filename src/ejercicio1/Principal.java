/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 *//**
 *
 * @author zunig
 */
package ejercicio1;

public class Principal {

  public static void main(String[] args) {
       
        Vehiculo vehiculo = new Vehiculo("Mazda", 171);
        Coche coche = new Coche("Audi A8 L", 250, 6);
        
        vehiculo.mostrarInformacion();
        System.out.println("");
        coche.mostrarInformacion();
    }
    
}
