/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_1_17_.contraseña;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA_1_17_Contraseña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario;
        String contra;
        Scanner captu = new Scanner (System.in);
        System.out.println("usuario");
        usuario = captu.nextLine();
        System.out.println(usuario);
       System.out.println("contra");
        contra= captu.nextLine();
        if (usuario.equals ("admin")  &&  contra.equals ("1234")){
            
        
        System.out.println("acceso  correcto");
        }else{
            System.out.println("acceso denegado");
        
    }
                
    
}
    }