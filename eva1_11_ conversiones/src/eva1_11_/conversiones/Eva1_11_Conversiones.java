/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_.conversiones;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class Eva1_11_Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // conbersiones de temperatura
        double fahr, cent; 
        
        
        Scanner captu = new Scanner (System.in);
        
        System.out.println("captura los fahrenheit:");
        
        fahr = captu.nextDouble();
        
        cent = (fahr - 32) / 1.8; //expresion  
        System.out.println("°C System.out.println= " + cent);
        
        
        System.out.println("captura los celsius");
        
        double temp1, temp2;
        temp1= captu.nextDouble();
        temp2= ((temp1*9)/5)+32;
        
        System.out.println("la temperatura en F es:"+"___"+ temp2);
        
        System.out.println("captura los kelvin");
        
        double temp3, temp4;
        temp3= captu.nextDouble();
        temp4= ((temp3 +273));
        
        System.out.println("la tenperatura en k es:"+" temp 4");
        
        
        
        
        
        
       
        
        
        
        
        

        
        
                
        
        
        

        
        
        
        
    }
    
}
