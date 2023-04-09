
package defaultPackage;

public class Manipula_CadenasIII {
    
    public static void main(String[] args) {
        
        String alumno1, alumno2;
        
        alumno1 = "David";
        alumno2 = "david";
        
        // Compara alumno1 con alumno2 (distingue Mayus)
        System.out.println(alumno1.equals(alumno2));
        // Compara alumno1 con alumno2 (NO distingue Mayus)
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
        
    }
    
}
