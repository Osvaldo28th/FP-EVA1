/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_conversion;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_9_CONVERSION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double fa, ce, ka;
        Scanner cap = new Scanner (System.in);
        
        System.out.println("Temperatura a grados farenheit:");
        fa = cap.nextDouble();
        ce = (fa- 32) / 1.8;
        System.out.println("ºC:" + " " + ce + "ºF");
        
        System.out.println("**************************************");
        
        System.out.println("Temperatura a grados celsius:");
        ce = cap.nextDouble();
        fa =  (ce * 1.8) + 32;
        System.out.println("El resultado es:" + " " + fa + "ºC");
        
        System.out.println("**************************************");
        
        System.out.println("Grados Celsius a  Kelvin:");
        ka = cap.nextDouble();
        ce = ka + 273.15;
        System.out.println("El resultado es:" + " " + ce + "ºC");
        
         System.out.println("**************************************");
        
        
    }
    
}
