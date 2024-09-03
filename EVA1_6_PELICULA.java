/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_pelicula;
import java.util.Scanner;
/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_6_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom;
        String gen;
        int dur;
        String rep;
        String cla;
        
        //Las operaciones dependen del tipo de datos
        //Numero entero o decimal - aritmeticas
        //Se ejecutan de izq a der 
        //1. raices y potencias
        //2.Multiplicacion y division
        //3.suma y resta
        //Boolean valores logicos (verdadero o falso)- No se puedem hacer operaciones
        //and, or, not, nand - matematicas discretas- No se puedem hacer operaciones
        //Cadena concatenacion (unir cadenas)
        // Las operaciones se ralizan a traves de simbolos de lenguaje
        Scanner cap;
        cap = new Scanner(System.in); 
        
         System.out.println("Introduce el nombre de la pelicula:");
         nom = cap.nextLine();
         System.out.println(nom);
         
         System.out.println("--------------------------------------");
         
         System.out.println("Introduce el genero de la pelicula:");
         gen = cap.nextLine();
         System.out.println(gen);
         
          System.out.println("--------------------------------------");
         
         System.out.println("Esta es la duracion de la pelicula");
         dur = cap.nextInt();
         cap.nextLine();
         System.out.println(dur);
         
          System.out.println("--------------------------------------");
         
         System.out.println("Introduce el reparto de la pelicula:");
         rep = cap.nextLine();
         System.out.println(rep);
         
         System.out.println("Esta es la clasificacion de la pelicula:");
         cla = cap.nextLine();
         System.out.println(cla);

        System.out.println("****************************************");
         System.out.println("DATOS CAPTURADOS");
        System.out.println(nom);
        System.out.println(gen);
        System.out.println(dur);
        System.out.println(rep);
        System.out.println(cla);
        
    }
    
}
