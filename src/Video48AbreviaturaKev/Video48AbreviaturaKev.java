/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video48AbreviaturaKev;

import Video48AbreviaturaKev.Uso.talla;
import java.util.Scanner;

public class Video48AbreviaturaKev {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Uso n = new Uso();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe una talla: MINI,MEDIANO,GRANDE,MUY_GRANDE");
       
        String entrada_datos = entrada.next().toUpperCase();
        
        talla la_talla=Enum.valueOf(talla.class, entrada_datos);
        
        System.out.println("Talla = "+la_talla);
        
        System.out.println("Abreviatura = " + la_talla.dameAbreviatura());
    }
    
}


    
    

