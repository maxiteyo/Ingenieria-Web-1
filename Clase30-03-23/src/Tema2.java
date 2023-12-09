
import java.util.Scanner;


public class Tema2 {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingrese largo del arreglo= ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        //Crear el arreglo
        int[] enteros = new int[largoArreglo];
        //Pedir los elementos
        for(int i=0 ; i<largoArreglo ; i++){
            System.out.println("Proporciona enteros["+i+"] = ");
            enteros[i]= Integer.parseInt(consola.nextLine());
        }
        for(var numero: enteros)
            System.out.println("Valor: "+numero);
        
        //Actividad: Mostrar en que posicion esta guardado
        for(int i=0 ; i<largoArreglo ; i++){
            System.out.println("entero["+i+"]= "+enteros[i]);
        }
    }
}
