/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_rango;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_17_RANGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        int calif;
        
        System.out.println("Cual es tu calificaion:");
        calif = cap.nextInt();
        
        if (calif >= 0 && calif <= 100){
        System.out.println("Tu calificacion es valida");
        }else{
        System.out.println("Tu calificacion no es valida");
        }
        
    }
    
}
