
import java.util.Scanner;

public class Tema1 {

    public static void main(String[] args) {
        var numero=0;
        var consola = new Scanner(System.in);
    
        System.out.println("Ingrese un numero de mes: ");
        numero = Integer.parseInt(consola.nextLine());//espera siempre un caracter String, por eso lo convertimos.
       if (numero == 12 || numero == 1 || numero == 2) {
            System.out.println("Es verano");
        } else {
            if (numero == 3 || numero == 4 || numero == 5) {
                System.out.println("Es otono");
            } else {
                if (numero == 6 || numero == 7 || numero == 8) {
                    System.out.println("Es invierno");
                } else {
                    if (numero == 9 || numero == 10 || numero == 11) {
                        System.out.println("Es primavera");
                    }
                }
            }
        }

    }
}
