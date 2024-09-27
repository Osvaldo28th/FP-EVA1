/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_switch_meses;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_21_SWITCH_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner cap = new Scanner(System.in);
        int mes;
        System.out.println("Numero correspodiente al dia (1-12)");
        mes = cap.nextInt();
        
        switch (mes){
            case 1:
                System.out.println("Es enero");
                break;//Fin de la instruccion
                case 2:
                System.out.println("Es febrero");
                break;
                case 3:
                System.out.println("Es marzo");
                break;
                case 4:
                System.out.println("Es abril");
                break;
                case 5:
                System.out.println("Es mayo");
                break;
                case 6:
                System.out.println("Es jnuio");
                break;
                case 7:
                System.out.println("Es julio");
                break;
                case 8:
                    System.out.println("Es agosto");
                    break;
                case 9:
                    System.out.println("Es septiembre");
                    break;
                    case 10:
                    System.out.println("Es octubre");
                    break;
                    case 11:
                    System.out.println("Es noviembre");
                    break;
                    case 12:
                    System.out.println("Es diciembre");
                    break;
                    
                default://Ultima seccion del switch
                    System.out.println("Numero no valido del (1-12)");
        }
    }
    
}
