/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_.entrada_datos;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA1_5_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        
        //captura de datos del teclado;
        //scanner===> herramientas (clase)
        // scanner: es un tipo de dato 
        
        Scanner captu;// incorporar la herramienta al codigo 
        //no existe hay que crearlo 
        captu = new Scanner (System.in);//creamos la herramienta scanner
        
        //darle la instruccion al usuario 
        System.out.println ("introduce tu nombre complreto;");
        nombre = captu.nextLine(); //capturamos todo el texto 
                                           // hasta que precione enter
        //imprimir los datos 
        
        System.out.println("<<<<<<<<<<<<<<datos capturados>>>>>>>>>>>>>>>>>>>");
        System.out.println(nombre);
                
                                           
                                         
                                          
                                           
                
        
       
    }
    
}
