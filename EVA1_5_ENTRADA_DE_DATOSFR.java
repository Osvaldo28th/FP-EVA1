/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_entrada_de_datosfr;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_5_ENTRADA_DE_DATOSFR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaracion de variables
        String marca;
        String modelo;
        int year;
        double precio;
        //¿Como se captura informacion?
        //SCANNER
        //Herramienta-->Clase: mos proporciona muchas herramientas
        Scanner captu;//declaramos la herramienta, previamente
                      //hay que importarla con un import  
        captu = new Scanner(System.in);          //creamos la herramienta
                                                   //Hay que darle instrucciones al usuario
        System.out.println("Introduce la marca del vehiculo:");
            //capturamos - una asignacion
        marca = captu.nextLine(); //regresa todo el texto hasta que damos enter
        System.out.println(marca);
        System.out.println("---------------------------------");
        
        System.out.println("Introduce el modelo del carro:");
        modelo = captu.nextLine();
        System.out.println(modelo);
         System.out.println("---------------------------------");
        
        System.out.println("Introduce el year del carro:");
        year = captu.nextInt();
        System.out.println(year);
         System.out.println("---------------------------------");
        
          System.out.println("Introduce el precio del carro:");
          precio = captu.nextDouble();
          System.out.println(precio);
          
          System.out.println("**********************************");
          
          System.out.println("Datos capturados:");
          System.out.println(marca);
            System.out.println(modelo);
              System.out.println(year);
                System.out.println(precio);
    }
    
}
