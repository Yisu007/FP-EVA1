/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA1_25_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int year;
        Scanner captu= new Scanner(System.in);
        System.out.println ("captura el year");
        year= captu.nextInt();
        captu.nextLine();
        
        if((year % 4==0 && year!=0 )||(year %400==0)){
        System.out.println("año bisiesto");
          }else{
               System.out.println("año no bisiesto");
    }
        
        
                
    }
    
}
