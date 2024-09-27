/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_meses;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_19_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        int mes;
        System.out.println("Numero correspodiente al mes (1-12)");
        mes = cap.nextInt();
        
        if (mes == 1){
        System.out.println("Es enero");
        } else if (mes == 2){
        System.out.println("Es febrero");
        }else if (mes == 3){
        System.out.println("Es marzo");
        }else if (mes == 4){
        System.out.println("Es abril");
        }else if (mes == 5){
        System.out.println("Es mayo");
        }else if (mes == 6){
        System.out.println("Es junio");
        }else if (mes == 7){
        System.out.println("Es julio");
        }else if (mes == 8){
        System.out.println("Es agosto");
        }else if (mes == 9){
        System.out.println("Es septiembre");
        }else if (mes == 10){
        System.out.println("Es octubre");
        }else if (mes == 11){
        System.out.println("Es noviembre");
        }else if (mes == 12){
        System.out.println("Es diciembre");
        }else{
        System.out.println("No es numero valido del (1-12)");}
        
        
        
    }
    
}
