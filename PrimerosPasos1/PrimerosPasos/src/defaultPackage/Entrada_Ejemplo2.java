package defaultPackage;

import javax.swing.*;

public class Entrada_Ejemplo2 {
   
    public static void main(String[] args) {
        
        //Muestra una ventana con un mensaje y guarda lo que introduce el usuario en un String
        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor:");
        
        String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor: ");
        
        // Lo pasamos a int
        int edad_usuario = Integer.parseInt(edad);
        
        System.out.println("Hola " + nombre_usuario + ". Tienes " + edad_usuario + " años."
                            + " El año que viene tendrás " + (edad_usuario+1) + " años.");
        
    }
    
}
