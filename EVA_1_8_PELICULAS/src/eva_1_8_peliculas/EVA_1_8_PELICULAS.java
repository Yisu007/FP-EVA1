/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_8_peliculas;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA_1_8_PELICULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        String genero;
        int duracion;
        String reparto;
        String clasificacion;
        Scanner captu;
        captu =new Scanner (System. in);
        
        System.out.println("captura el nombre de la pelicula");
        nombre  = captu.nextLine();
        System.out.println("captura el genero de la pelicula");
        genero= captu.nextLine(); 
        System.out.println("captura la duracion de la pelicula ");
        duracion = captu.nextInt();
        System.out.println("captura el reparto");
        reparto = captu.nextLine();
        System.out.println("captura la clasificacion de la pelicula");
        clasificacion= captu.nextLine();
        
        System.out.println("datos de la pelicula ");
        System.out.println("nombre");
        System.out.println(nombre);
        System.out.println("genero");
        System.out.println(genero);
        System.out.println("duracion");
        System.out.println(duracion);
        System.out.println("reparto");
        System.out.println(reparto);
        System.out.println("clasificacion");
        System.out.println(clasificacion);
    }
        
        
        
        
        
        
    
    
}
