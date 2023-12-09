
import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        
        int[] arreglo = new int[5];
        var consola = new Scanner(System.in);
        
        for(int i=0; i < arreglo.length; i++){
            System.out.println("Ingrese digito ["+i+"]:");
            arreglo[i]=Integer.parseInt(consola.nextLine());
        }
        
        for(int i=0;i<arreglo.length;i++){
            System.out.println("Arreglo ["+i+"]:"+ arreglo[i]);
            
        }
    }
    
}
