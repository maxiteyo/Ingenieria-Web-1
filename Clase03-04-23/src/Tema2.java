
import java.util.Scanner;


public class Tema2 {
    
    static void saludar(String mensaje){//en las funciones no se usa var en el parentesis
        System.out.println("Mensaje: " +mensaje);
    }
    
    public static void main(String[] args) {
        System.out.println("Proporcione un mensaje: ");
        var mensajeArg = new Scanner(System.in).nextLine();
        saludar(mensajeArg);
        
    }
    
}
