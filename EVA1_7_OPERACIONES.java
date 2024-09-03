/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_operaciones;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA1_7_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERACIONES ARITMETCIAS
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
        //Division --> el manejo de tipo de datos
        //Dividimos enteros, java da como resultado un entero
        
        int x = 10;
        int y = 5;
        //Declaracion de multiples variables con el mismo tipo de dato
        int sum, res, div, mul, pot, raiz;
        //SUMA Y RESTA
        
        sum = x + y;
        System.out.println("La suma de x + y: ");
        System.out.println(sum);
        
        res = x - y;
        System.out.println("La resta de x - y es; ");
        System.out.println(res);
        
        mul = x * y;
        System.out.println("La multiplicacion de x(10) * y(5) es ");
        System.out.println(mul);
        
        div = x / y;
        System.out.println("La division de x / y es: ");
        System.out.println(div);
        //cambiamos los valores de x y y
        x = 11;
        y = 3;
        div = x / y;
        System.out.println("La division de x(11) y y (3)");
        System.out.println(div);
        
        double val1=11;
        double val2=3;
        double diviD;
        diviD = val1 / val2;
        System.out.println("La divison de x(11) y y(3) es ");
        System.out.println(diviD);
    
        
        
        
     
    }
    
}
