/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_tipo.de.per;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA1_16_tipoDePer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char tipo;
        Scanner captu = new Scanner (System.in);
        System.out.println("tipo de persona F----> fisica, tipo de persona M---->moral ");
         tipo= captu.nextLine().charAt(0);
         System.out.println(tipo);
         //imprimir el tipo de persona 
         //""--> cadena de texto ,"--> es un caracter 
         //F
         if (tipo == 'f'){
        System.out.println("tipo de persona fisica");
         }else{
        System.out.println("tipo de persona moral");
    }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
                
    }
    
}
