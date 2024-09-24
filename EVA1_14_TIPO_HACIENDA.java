/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_14_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char tipo;
        
        
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Selecciona F  si es fisica y M si es moral");
        tipo = cap.nextLine().charAt(0);
        
        System.out.println("El caracter es" + " " + tipo);
        if (tipo == 'F')
            System.out.println("PERSONA FISICA");
        
        else 
            System.out.println("PERSONA MORAL");
            
        
    }
    
}
