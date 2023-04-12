package defaultPackage;


public class Uso_Arrays {
   
    public static void main(String[] args) {
        
        /*int [] mi_matriz = new int[5]; //Declaración de arrays
        
        mi_matriz[0]=5;
        mi_matriz[1]=38;
        mi_matriz[2]=17;
        mi_matriz[3]=22;
        mi_matriz[4]=-11;*/
        
        int [] mi_matriz = {5, 38, 17, 22, -11, -777, 22,
                            58, 14, 28, 7, 27, 6, 9, 1997, 1998}; // Otra forma de declarar arrays
        
        for(int i=0; i<mi_matriz.length; i++) {
            System.out.println("Valor del índice " + i + "= " + mi_matriz[i]);
        }
        
    }
    
}
