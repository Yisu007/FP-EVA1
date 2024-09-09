/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA1_13_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //captura la edad 
       int edad;
         Scanner captu = new Scanner (System.in);
         System.out.println(" captura la edad ");
         edad= captu.nextInt();
        
        
         //instrucciones if
         //si(algo se cumple)
         // que hago si se cumple 
         //si no comple (opcional ) es falso 
         //que hacen si no se cumplen
         if(edad>=18){//bloque de verdadero 
             //aui van las instrucciones si la 
             // evaluacion es verdadero 
             System.out.println("Adulto: mayor de edad");
             }else{
             System.out.println("menir de edad");
         
         }
         
         
     
        
        
        
       
    }
    
}
