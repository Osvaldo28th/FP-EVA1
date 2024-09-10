/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_califas;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calif;
        
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Cual es tu calificacion:");
        calif = cap.nextInt();
        
        if (calif >= 70){
            System.out.println("APROBADO");
        } else {
            System.out.println("REPROBADO");
        }
    }
    
}
