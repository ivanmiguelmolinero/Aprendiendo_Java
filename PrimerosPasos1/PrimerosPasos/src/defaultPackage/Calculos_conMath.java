
package defaultPackage;

public class Calculos_conMath {
    
    public static void main(String[] args) {
        
        double raiz = Math.sqrt(9);
        
        System.out.println(raiz);
        
        float num1 = 5.85F; //A los float hay que ponerles F al final
        
        int resultado = Math.round(num1);
       
        System.out.println(resultado);
        
        /* Reconversión de tipos
        Pasar de long a int
        de int a float
        etc
        */
        double num2 = 8.88;
        
        int resultado2 = (int)Math.round(num2);
        
        System.out.println(resultado2);
        
        // Potencias
        double base = 5;
        double exponente = 3;
        
        int resultado3 = (int)Math.pow(base, exponente);
        
        System.out.println("El resultado de elevar " + (int)base
                            + " a " + (int)exponente
                            + " es " + resultado3);
        
    }
    
}
