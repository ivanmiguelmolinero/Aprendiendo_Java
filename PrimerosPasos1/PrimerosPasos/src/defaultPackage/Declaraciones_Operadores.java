
package defaultPackage;

public class Declaraciones_Operadores {
    
    public static void main(String args[]){
        int a=5;
        
        int b;
        
        b=7;
        
        int c = b+a;
        c++; // Incrementa en 1 su valor
        c+=6; //Incrementa en 6 su valor
        c-=b+7; //Decrementa en b+7 su valor
        System.out.println(c);
        
        /* Para dividir hay que trabajar con todos las
        variables siendo o bien float o bien double
        double es como float pero con más decimales
        */
        double e = 23;
        double f= 11;
        double d = e/f;
        System.out.println(d);
        
        //Constantes
        
        final double a_pulgadas = 2.54; //final es la palabra reservada para constantes
        // 2.54 cm = 1 pulgada
        
        double cm = 6;
        
        double resultado = cm/a_pulgadas;
        
        System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");
        
        //Declaración de varias variables en la misma línea
        int operador1, operador2, resultado2;
        
        operador1 = 9;
        operador2 = 7;
        resultado2 = operador1 + operador2;
        System.out.println(resultado2);
    }
    
}
