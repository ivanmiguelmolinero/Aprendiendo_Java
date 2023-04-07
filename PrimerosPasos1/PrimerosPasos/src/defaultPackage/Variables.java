package defaultPackage;


public class Variables {
    
    public static void main(String args[]){
       // Procedimiento principal
       // Ejemplos de inicialización de variables
       byte edad; //byte va de -128 a 127
       edad= 35;
       System.out.println(edad);
       
       // Ahora inicializamos en una sola linea
       int edad_Ivan= 25;
       System.out.println(edad_Ivan);
       edad++; // incrementa en 1 unidad
       System.out.println(edad);
       edad-= 35; // decrementa en X unidades (35 en este caso)
       // También está la opción de edad+=X
       System.out.println(edad);
    }
    
}
