/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_if_else_anidados;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_18_IF_ELSE_ANIDADOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        int dia;
        System.out.println("Numero correspodiente al dia (1-7)");
        dia = cap.nextInt();
        
        if( dia == 1){
        System.out.println("Es lunes");
        }else if (dia == 2){
        System.out.println("Es martes");
        }else if (dia == 3){
        System.out.println("Es miercoles");
        }else if (dia == 4){
        System.out.println("Es jueves");
        }else if (dia == 5){
        System.out.println("Es viernes");
        }else if (dia == 6){
        System.out.println("Es sabado");
        }else if (dia == 7){
        System.out.println("Es domingo");
        }else{
        System.out.println("No es un numero valido del 1-7");
        } 
            
        
    }
    
}
