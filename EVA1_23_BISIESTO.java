/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_bisiesto;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_23_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
       
        //Saber si un numero es multiplo de 4
        //RESIDUO ES CERO ----> DIVISION EXACTA
        //MODULO --> CALCULO DEL RECIDUO ---> %
        int modulo = 2300 % 4;//--> 0
        System.out.println("El residuo es:" +  " " + modulo );
        //Divisble entre 4
        //Pero no divisble entre 100
        //Pero si es divisble entre 100
        //Divisble entre 400
       
        int year;
        
       
        System.out.println("Cual es tu year:");
        year = cap.nextInt();
        
       // != --> Diferente a 
       // ! --> Invierte el valor de verdad con una condicion
                
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
             System.out.println("*************************************");
             System.out.println("El year"+ " " + year + " " + "es bisiesto");
        }else{
             System.out.println("*************************************");
             System.out.println("El year" + " " + year + " " +  "no es bisiesto");
        }
      
              
            
        }
    
}
