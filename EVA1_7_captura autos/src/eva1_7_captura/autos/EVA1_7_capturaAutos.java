/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_captura.autos;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA1_7_capturaAutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String marca;
       
        String modelo;
        int year;
        double  precio;
        Scanner captu;
        captu= new Scanner(System.in);
        
        System.out.println("captura la marca  del auto ");
        marca = captu.nextLine();
        System.out.println("captura el modelo de auto");
        modelo = captu.nextLine();
        System.out.println("captura el year del auto");
        year = captu.nextInt();
         System.out.println("captura el precio del auto");
         precio =captu.nextDouble();
       
         
                 
        
        
        
        
                
        System.out.println("captura el precio del auto");
        
        
        System.out.println("imprecion de datos ");
        System.out.println("marca");
        System.out.println(marca);
        System.out.println("modelo");
        System.out.println(modelo);
        System.out.println("year");
        System.out.println(year);
        System.out.println("precio");
        System.out.println(precio);
                
           
        
        
        
        
        
        
        
    
        
    }
    
}
