
import java.util.Scanner;


public class Tema3c {
    public static void main(String[] args) {
        
        int renglones, columnas;
        var consola = new Scanner(System.in);
        
        System.out.println("Proporcione los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.println("Proporcione las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        
        int[][] matriz = new int[renglones][columnas];
        
        for(int ren=0 ; ren < renglones ; ren++){
            for(int col=0 ; col < columnas ; col++){
                System.out.print("Dato["+ ren +"]["+ col +"]= ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        
        System.out.println("Imprimir la matriz completa: ");
        for(int ren=0 ; ren < matriz.length ; ren++){
            for(int col=0 ; col < matriz[ren].length ; col++){
                System.out.print(" Matriz["+ren+"]["+col+"]= " +matriz[ren][col]);
            }
            System.out.println();//salto de linea
        }
    }
    
}
