/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller3;

/**
 *
 * @author altoc
 */
public class MatematicasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        double resultado;
        
        
        resultado  = Matematicas.sumar (10,2);
             System.out.println("Resultado de la suma es: "+resultado);
             
        resultado  = Matematicas.restar (10,2);
             System.out.println("Resultado de la resta es: "+resultado);     
             
        resultado  = Matematicas.multiplicar (10,2);
             System.out.println("Resultado de la multiplicacion es: "+resultado);  
             
        resultado  = Matematicas.dividir (10,2);
             System.out.println("Resultado de la division es: "+resultado);     
     
    }
    
}
