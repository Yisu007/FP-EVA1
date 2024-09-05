/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class Eva1_12_formulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // calcular la distancia 
       double velo, tiem, acel, dist;
        Scanner captu= new Scanner(System.in);
        
        System.out.println("calcula la distancia");
        
        dist= captu.nextDouble();
        
        System.out.println("calcula la velocidad");
        
        velo=captu.nextDouble();
        
        System.out.println("calcula el tiempo");
        
        tiem=captu.nextDouble();
        
        System.out.println("calcula la aceleracion");
        
        acel= captu.nextDouble();
        
        dist= velo*tiem+(acel*tiem*tiem)/2.0;
        
        System.out.println("aceleracion="+ dist);
                
        
        
       
        

    
}

}
