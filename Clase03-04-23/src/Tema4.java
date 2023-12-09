
public class Tema4 {
    
    static void cambiarValor(int argumento){//los tipos primivitos(int,float,boolean) se pasan por valor, por eso no cambia
        argumento = 20;//este "argumento" es local a la funcion
    }
    
    public static void main(String[] args) {
        var argumento = 10;
        System.out.println("Antes de llamar la funcion: " + argumento);
        cambiarValor(argumento);
        System.out.println("Despues de llamar la funcion: " + argumento);
    }
}
