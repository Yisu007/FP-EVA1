/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_22_.pkgcase;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class Eva_1_22_Case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         int semadia;
         
         
         Scanner captu= new Scanner (System.in);
         
         System.out.println("numero del 1 al 7");
         
         semadia= captu.nextInt();
         
         switch (semadia){
            
           
        case 1:
            System.out.println("domingo");
            break;
        case 2:
             System.out.println("lunes ");
             break;
        case 3:
             System.out.println("martes");
             break;
        case 4:
             System.out.println("miercoles");
             break;
        case 5 :
             System.out.println("jueves");
             break;
        case 6:
           
            System.out.println("viernes");
            break;
                  
        case 7:
            System.out.println("sabado");
            break;
        default:
            System.out.println("no valido el numero");    
    }
    }
}
