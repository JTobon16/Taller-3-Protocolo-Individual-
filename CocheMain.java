/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller3;

/**
 *
 * @author altoc
 */
public class CocheMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coche coche1 = new Coche ("Chevrolet","Aveo");
        Coche coche2 = new Coche ("Chevrolet","Spark");
        Coche coche3 = new Coche ("Renoult","Simbol");
        
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);
        
        Coche.mostrarcontadorCoche();
    }
    
    
                
   
 
    
}
