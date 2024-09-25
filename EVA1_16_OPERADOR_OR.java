/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_16_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int km, me;
        
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Cuanto kilometraje tiene tu auto:");
        km =cap.nextInt();
        
        System.out.println("Cuantos meses tienes sin darle matenimiento:");
        me = cap.nextInt();
        
        if ( km >= 5000 || me >= 6){
        System.out.println("Tu vehiculo necesita mantenimiemnto");
        }else{
            System.out.println("Tu vehiculo no necesita mantenimiento");
        }
    }
    
}
