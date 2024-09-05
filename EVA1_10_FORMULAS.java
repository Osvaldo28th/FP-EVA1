/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_10_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Velocidad inicial
        //Tiempo en segundos
        //Aceleracion
        //Obtenemos distancia en m
        
        double vel, ti, ac, di;
        Scanner cap = new Scanner(System.in); 
        
        System.out.println("TRANSFORMACION DE DISTANCIA A METROS");
        System.out.println("Proporciona los siguientes daots");
        System.out.println("**************************");
        
        System.out.println("Cual es la velocidad: ");
        vel = cap.nextDouble();
        
        System.out.println("**************************");
        
        System.out.println("Cual es el tiempo");
         ti = cap.nextDouble();
         
         System.out.println("**************************");
         
         System.out.println("Cual es su aceleracion:");
         ac = cap.nextDouble();
        
         System.out.println("**************************");
         
         di= (vel*ti) + (ac*ti*ti)/2;
         System.out.println("La distancia a metros es " + di + "metros");
         
         System.out.println("**************************");   
         
    }
    
}
