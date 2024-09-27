/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_24_califas;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA_1_24_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int califa;
        Scanner captu= new Scanner(System.in);
        System.out.println("captura el promedio");
        califa=captu.nextInt();
        
        
        if (califa<=90){
        System.out.println("calificacion A");
        }else if (califa<=80){
            System.out.println("calificacion B");
        }else if (califa<=70){
            System.out.println("calificacion C");
        }else if (califa<=60){
            System.out.println("calificacion D");
        }else if (califa<=0){
            System.out.println("calificacion F");
        }else if (califa <=101){
            System.out.println("no existe esta calificasion");
            
            
            
                    
        }
        
    }
    
}
