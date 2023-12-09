
package Tema7;


public class MuestraConjunto {
    
    public static void mostrar(Object[] arr) {//en object puedo meter cualquier cosa
        for (int i=0; i < arr.length; i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
    
}
