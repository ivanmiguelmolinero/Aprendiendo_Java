package defaultPackage;

import java.util.*;
public class Evalua_edad {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu edad, por favor: ");
        
        int edad = entrada.nextInt();
        
        if (edad>=18 && edad<30) {
            System.out.println("Es mayor de edad.");
        } else if (edad>=30 && edad<40) {
            System.out.println("Eres adulto.");
        } else if (edad>=40 && edad<60) {
            System.out.println("Eres muy mayor.");
        } else if (edad>=60) {
            System.out.println("Eres un viejo.");
        } else {
            System.out.println("Es menor de edad.");
        }
        
    }
    
}
