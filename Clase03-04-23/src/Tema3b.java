
import java.util.Scanner;


public class Tema3b {
     static int sumar(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Introduzca a: ");
        var argA = Integer.parseInt(consola.nextLine());
        System.out.print("Introduzca b: ");
        var argB = Integer.parseInt(consola.nextLine());
        System.out.println("resultado = " + sumar(argA,argB));
    }
}
