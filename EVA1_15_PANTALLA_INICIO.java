/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_pantalla_inicio;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_15_PANTALLA_INICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner cap = new Scanner(System.in);
       
       String user, pass;
       final String USUARIO = "Osvaldo";
       final String PASSWORD = "1234";
       final double PI = 3.1416;
       
       System.out.println("Introduce el nombre de usuario:");
       user = cap.nextLine();
       
       System.out.println("La contraseña es:");
       pass = cap.nextLine();
       
       //COMO VALIDAMOS EL ACCESO?
       // SI (user == Osvaldo y pass == 1234)
       // ACCESO PERMITIDO
       //ELSE ACCESO DENEGADO
       //AND ---> OPERADOR LOGICO
       //AND == &&
       //OR == ||
       
       if (user.equals(USUARIO) && pass.equals(PASSWORD)){
       
           System.out.println("ACCESO PERMITIDO");
       } else{ 
           System.out.println("ACCESO DENEGADO");
       }
    }
    
}
