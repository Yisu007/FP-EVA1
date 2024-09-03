/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_operaciones.pkg2;

/**
 *
 * @author Xxj53
 */
public class EVA1_10_operaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //concatenacion cadenas ;
        //operador de concatenacion;
        //mismo simbolo con diferentes usos;
        //sobrecarga de operadores 
        String nombre= "rogelio";
       
        String apellido="morales";
         String nomComp;
         //concatenar: unir cadenas de texto 
         nomComp= nombre + " " + apellido;
         System.out.println(nomComp);
         
         // imprimir los datos:
         System.out.println("nombre del usuario:" +nombre);
         System.out.println("apellido del usuario:"+apellido);
         System.out.println("nombre completo del usuario:"+nomComp);
         
    }
    
}
