package defaultPackage;

import java.util.*;

public class Entrada_ejemplo1 {
   
    public static void main(String[] args) {
        
        // Objeto necesario para leer por consola
        Scanner entrada = new Scanner(System.in, "ISO-8859-1");
        
        System.out.println("Introduce tu nombre, por favor.");
        
        // Leemos una variable por consola
        String nombre_usuario = entrada.nextLine();
        
        System.out.println("Introduce tu edad, por favor.");
        
        // Para leer un int
        int edad_usuario = entrada.nextInt();
        
        System.out.println("OK. Eres " + nombre_usuario
                            + " y tienes " + edad_usuario + " años."
                            + " El año que viene tendrás " + (edad_usuario+1)
                            + " años.");
        
    }
    
}
