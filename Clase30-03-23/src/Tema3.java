
public class Tema3 {
    public static void main(String[] args) {
        //Definir constantes tamanio matriz
        final int RENGLONES = 2;//Es una constante,y siempre se escribe en mayuscula.No se pueden cambiar
        final int COLUMNAS = 3;
        //Definir la matriz y su dimension
        int[][] matriz = new int[RENGLONES][COLUMNAS];
        //Lleno la matriz
        matriz[0][0]=100;
        matriz[0][2]=200;
        matriz[1][2]=500;
        
        System.out.println("Valor: " + matriz[0][0]);
        System.out.println("Valor: " + matriz[0][2]);
        System.out.println("Valor: " + matriz[1][1]);
        System.out.println("Valor: " + matriz[1][2]);
    }
    
}
