/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_rangos;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA1_18_Rangos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int cali;
       Scanner captu = new Scanner (System.in);
       System.out.println("captura la calificacion");
       cali=captu.nextInt();
       if(cali>= 0 && cali <=100 ){//se puede poner if (cali >=70)
       System.out.println("calificacion aprobada ");
       
         }else{
          System.out.println("calificacion no  aprobatoria ");
        
        
    }
    
}}
