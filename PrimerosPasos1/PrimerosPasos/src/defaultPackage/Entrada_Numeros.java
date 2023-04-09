package defaultPackage;

import javax.swing.*;

public class Entrada_Numeros {
    
    public static void main(String[] args) {
        
        double x = 10000.0;
        
        //Así damos dos decimales al resultado
        System.out.printf("%1.2f", x/3);
        System.out.println("");
        
        String num1 = JOptionPane.showInputDialog("Introduce un número:");
        
        // Pasar de string a Double
        Double num2 = Double.parseDouble(num1);
        
        System.out.print("La raíz de " + num2 + " es ");
        
        System.out.printf("%1.2f", Math.sqrt(num2));
        System.out.println("");
    }
    
}
