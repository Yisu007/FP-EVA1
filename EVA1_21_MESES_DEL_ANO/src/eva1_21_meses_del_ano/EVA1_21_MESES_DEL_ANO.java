/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_meses_del_ano;

import java.util.Scanner;

/**
 *
 * @author Xxj53
 */
public class EVA1_21_MESES_DEL_ANO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int mesyear;
      
      Scanner captu = new Scanner (System.in);
      System.out.println("captura el numero de el year");
      mesyear = captu.nextInt();
      captu.nextLine();
      
      if (mesyear== 1){
          System.out.println("enero");
          }else if (mesyear==2){
       System.out.println("febrero");
       }else if (mesyear==3){
       System.out.println("marzo");
       }else if (mesyear==4){
       System.out.println("abril");
       }else if (mesyear==5){
       System.out.println("mayo");
       }else if (mesyear==6){
       System.out.println("junio");
       }else if (mesyear==7){
       System.out.println("julio");
       }else if (mesyear==8){
       System.out.println("agosto");
       }else if (mesyear==9){
       System.out.println("septiembre");
       }else if (mesyear==10){
       System.out.println("octubre");
       }else if (mesyear==11){
       System.out.println("noviembre");
       }else if (mesyear==12){
       System.out.println("diciembre ");
       }else{
           System.out.println("no es correcto el numero ");
      }
      
     
    }
    
}
