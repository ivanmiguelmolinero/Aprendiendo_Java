
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ivijo
 */
public class JavaApplication1 {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String numero = "Pi";
        // int float byte short double char string var(general)
        /*
        Así se hacen comentarios multilínea
        ves?
        Ale, otro más.
        */
        var saludo = "hola";
        System.out.println("Introduce el primer numero: ");
        var numero2 = entrada.nextInt();
        System.out.println("Introduce el segundo numero: ");
        var numero3 = entrada.nextInt();
        var operacionSuma = numero2 + numero3;
        var operacionResta = numero2 - numero3;
        var operacionMultiplicacion = numero2 * numero3;
        var fraseSuma = "La suma de los dos números es: ";
        var fraseResta = "La resta de los dos números es: ";
        var fraseMulti = "La multiplicacion de los dos números es: ";
        var fraseDiv = "La division de los dos números es: ";
        System.out.println("Hola, Mundo!");
        System.out.println("Hola " + numero + "!");
        System.out.println(saludo + " " + numero2);
        System.out.println(fraseSuma + (numero2 + numero3));
        System.out.println(fraseSuma + operacionSuma);
        System.out.println(fraseResta + operacionResta);
        System.out.println(fraseMulti + operacionMultiplicacion);
        if (numero3 == 0) {
            System.out.println("No se puede dividir entre 0");
        } else {
            var operacionDivision = numero2 / numero3;
            System.out.println(fraseDiv + operacionDivision);
        }
    }
    
}
