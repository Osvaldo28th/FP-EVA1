/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_calif.pkg1;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_22_CALIF1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner (System.in);
        int cal;
        
        System.out.println("Cual es tu calficacion?");
        cal = cap.nextInt();
        
        if (cal >= 90 && cal <= 100){
        System.out.println("tu calificacion es una A");
        }else if (cal >= 80 && cal <=89){
        System.out.println("Tu califacion es una B");
        }else if (cal >= 70 && cal <= 79){
        System.out.println("Tu calificacion es una C");
        }else if (cal >= 60 && cal <= 69){
        System.out.println("Tu calificacion es una D");
        }else if (cal >= 0 && cal <= 59){
        System.out.println("Tu calificacion es una F");    
        }else{
        System.out.println("El jumero tiene que ser del 0-100");} 
            
    }
    
}
