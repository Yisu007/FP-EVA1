/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA2_3_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int base,expo;
        Scanner captu=new Scanner(System.in);
        System.out.println("instroduce la base ");
        base=captu.nextInt();
        captu.nextLine();
        System.out.println("introduce el exponente ");
        expo=captu.nextInt();
        captu.nextLine();
        //System.out.println("potencia -"+ Math, pow (base, expo))
        int acum= 1 ;
        for (int i= 1 ; i<=expo ; i++){
            acum = acum * base ;
        }
        System.out.println("potencia =" + acum);
                                                                       //3 al cuadrado  -->3x3= 9
                                                                       //5 a la 4ta =
    }
    
}
