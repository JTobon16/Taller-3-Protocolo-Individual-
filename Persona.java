/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3;

/**
 *
 * @author altoc
 */
public class Persona {
    
   
    private String nombre;


    public Persona(String nombre) {
        this.nombre = nombre;
    }

    
      
   // public static void mostrarNombre() {
    //    System.out.println("Nombre: " + nombre);
   
    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }

    
    
    public static void main(String[] args) {
        // Crear una nueva instancia de Persona
        Persona persona = new Persona("Juan");
        persona.mostrarNombre();
        
    }
}

