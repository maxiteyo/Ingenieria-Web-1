
public class Tema5 {
    
    static void cambiarValor(int[] argumento){//los valores de objetos(arreglos,matrices) se pasan por referencia
        argumento[0] = 20;
        System.out.println("referencia: "+argumento);
    }
    
    public static void main(String[] args) {
        int[] argumento = {10};
        System.out.println("Antes de llamar la funcion: " + argumento[0]);
        System.out.println("referencia: "+argumento);
        cambiarValor(argumento);
        System.out.println("Despues de llamar la funcion: " + argumento[0]);
        System.out.println("referencia: "+argumento);
    }
}