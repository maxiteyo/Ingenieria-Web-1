
public class Tema6bEjercicio {
static void cambiarValor(char[] argumento){//es inmutable, no puedo cambiar caracter por caracter. Si hubiera sido un arrgelo de caracteres si hubiera cambiado
    argumento[0] = "Adios";
    }
    
    public static void main(String[] args) {
        var argumento = "Hola";
        System.out.println("Antes de llamar la funcion: " + argumento);
        cambiarValor(argumento);
        System.out.println("Despues de llamar la funcion: " + argumento);
    }        
}
