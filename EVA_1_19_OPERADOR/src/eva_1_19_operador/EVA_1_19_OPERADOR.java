/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_19_operador;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA_1_19_OPERADOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      int km;
      int meses;
      Scanner captu= new Scanner (System.in);
      System.out.println("captura los kilometros de tu auto ");
      km= captu.nextInt();
      System.out.println("  ");
      System.out.println("captura los meses");
      meses= captu.nextInt();
      System.out.println("  ");
      
      if (km >=5000 || meses >= 5) {
          System.out.println(" cambio de aceite ");
      }else{
          System.out.println("todavia no necesita cambio de aceite ");
      }
            
           
            
      
        
    }
    
}
