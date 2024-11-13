/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3;

/**
 *
 * @author altoc
 */
public class Coche {
    
    private static int contadorCoches =0;
    private String marca;
    private String modelo;
    
    
    
    
    public Coche(String marca, String modelo){
        contadorCoches++;
        this.marca = marca;
        this.modelo = modelo;
               
    }
    
    public static void mostrarcontadorCoche(){
        System.out.println("El numero de coches creado es: "+contadorCoches);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return """
               Coche=
               marca=""" + marca + ", modelo=" + modelo + '}';
    }

   
    
    
}
