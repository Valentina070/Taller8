/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

 *//**
 *
 * @author zunig
 */
package ejercicio3;

public class Principal {
    public static void main(String[] args) {
       
        Empleado empleado = new Empleado("Valentina Zuñiga", 20000000);
        Gerente gerente = new Gerente("Neyder Escalante", 30000000, "Logistica");
        
        empleado.mostrarDetalles();
        System.out.println("");
        gerente.mostrarDetalles();
        System.out.println("");
    }
    
}
