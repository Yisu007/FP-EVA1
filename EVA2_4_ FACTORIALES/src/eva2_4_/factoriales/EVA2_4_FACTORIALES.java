/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_.factoriales;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA2_4_FACTORIALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor,facto;
        
        Scanner captu= new Scanner (System.in);
        System.out.println("captura el numero para valor ");
        valor =captu.nextInt();
        captu.nextLine();
        
        facto=1;
       
        for (int i= valor; i >= 1; i-- ){
            facto = facto * i ;
            
            
            
        }
        System.out.println("el factorial de  " + valor + " - "+ facto);
        
                
       
    }
    
}
