package defaultPackage;

import java.util.*;
import javax.swing.*;
public class Areas {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Leemos la opción
        System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo"
                            + "\n3: Triángulo \n4: Círculo");
        int figura = entrada.nextInt();
        
        //Evaluar el valor introducido por el usuario
        switch (figura) {
            case 1: // Cuadrado
                //Leemos el valor del lado
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado:"));
                
                System.out.println("El área del cuadrado es " + Math.pow(lado, 2)); //lado^2
                break;
            case 2: //Rectángulo
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
                System.out.println("El área del rectángulo es " + base*altura);
                break;
            case 3: //Triángulo
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
                System.out.println("El área del triángulo es " + (base*altura)/2);
                break;
            case 4: //Círculo
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio:"));
                System.out.print("El área del círculo es ");
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
                System.out.println("");
                break;
            default:
                System.out.println("La opción no es correcta.");
        }
        
    }
    
}
