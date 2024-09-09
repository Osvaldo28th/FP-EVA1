/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_11_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONDICIONAL
        //LOGICA BOLEANA --> OPERACIONES DE VERDADERO O FALSO
        // Operadores logicos
        // > Mayor que
        // < Menor que
        // >= Mayor o igual
        // <= Menor o igual
        // == Igual que
        // != Diferente que
        // ! Negacion (not)
        // && Y (AND)
        // || O (OR)
        
        int ed;
        
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Cual es tu edad:");
        ed = cap.nextInt();
        
        //DETERMINAR SI ES ADULTO O NO 
        //LAS OPERACIONES LOGICAS SOLO GENERAN COMO 
        //RESULTADO VERDADERO 0 FALSO
        //SI SON VARIAS INSTRUCCIONES HAY QUE USAR LLAVES PARA SEPARARLAS
        
        if (ed >= 18) { //BLOQUE PARA EL VERDADERO
        System.out.println("Eres mayor de edad");
        } 
        else { //BLOQUE PARA FALSO (ES OPCIONALES/ SOLO SI ES NECESARIO)
                System.out.println("NO ERES MAYOR DE EDAD");
        } 
    }
    
}
