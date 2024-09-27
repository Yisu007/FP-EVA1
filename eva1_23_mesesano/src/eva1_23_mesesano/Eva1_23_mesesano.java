/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_mesesano;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class Eva1_23_mesesano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mesyear;
        Scanner captu= new Scanner(System.in);
        System.out.println("captura el numero del mes del 1 al 12");
        mesyear= captu.nextInt();
        switch (mesyear){
            
         case 1:
            System.out.println("enero");
            break;
             case 2:
            System.out.println("febrero ");
            break;
             case 3:
            System.out.println("marzo");
            break;
             case 4:
            System.out.println("abril");
            break;
             case 5:
            System.out.println("mayo");
            break;
             case 6:
            System.out.println("junio");
            break;
             case 7:
            System.out.println("julio");
            break;
             case 8:
            System.out.println("agosto");
            break;
             case 9:
            System.out.println("septiembre ");
            break;
             case 10:
            System.out.println("noviembre ");
            break;
             case 11:
            System.out.println("octubre");
            break;
             case 12:
            System.out.println("diciembre");
            break;
             default:
                 System.out.println("numero no coincide ");
        }
        
        
       
    }
    
}
