/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_aguila_sol;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_13_AGUILA_SOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ALEATORIO
        //GEMERAR NUMEROS ALEATORIOS
        
        double val = Math.random(); // GUARDA UN UN NUMERO ENTRE 0-1 Y GENERA UN VALOR
        //VALORES ENTRE >= 0 Y .99999999999
        
        
        if (val >= .5){
            System.out.println("ES AGUILA");
        } else {
            System.out.println("ES SELLO");
        }
            
    }
    
}
