package defaultPackage;

import javax.swing.*;
public class Uso_Arrays2 {
    
    public static void main(String[] args) {
        
        String [] paises = new String[8];
        
        for(int i=0; i<paises.length; i++){
            
            paises[i] = JOptionPane.showInputDialog("Introduce país " + (i+1));
        }
        
        /*paises[0] = "España";
        paises[1] = "México";
        paises[2] = "Colombia";
        paises[3] = "Perú";
        paises[4] = "Chile";
        paises[5] = "Argentina";
        paises[6] = "Ecuador";
        paises[7] = "Venezuela";*/
        
        //String [] paises = {"España", "México", "Colombia", "Perú", "Chile",
        //                    "Argentina", "Ecuador", "Venezuela"};
        
        /*for(int i=0; i<paises.length; i++){
            
            System.out.println("País " + (i+1) + " " + paises[i]);
        }*/
        
        for(String elemento:paises){
            System.out.println("País: " + elemento);
        }
        
        // OTRO EJEMPLO
        int [] matriz_aleatorios = new int[150];
        
        for(int j=0; j<matriz_aleatorios.length; j++){
            //Introduce en la matriz números aleatorios entre 0 y 100
            matriz_aleatorios[j]=(int)Math.round(Math.random()*100); 
        }
        
        int indice = 1;
        for(int numero:matriz_aleatorios){
            System.out.println("Numero " + indice + ": " + numero);
            indice++;
        }
    };
    
}
