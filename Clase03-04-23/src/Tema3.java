
import java.util.Scanner;

public class Tema3 {

    static int sumar(int a, int b) {
        int resultadoSuma = a + b;
        return resultadoSuma;
    }

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Introduzca a: ");
        var argA = Integer.parseInt(consola.nextLine());
        System.out.print("Introduzca b: ");
        var argB = Integer.parseInt(consola.nextLine());
        var resultado = sumar(argA, argB);
        System.out.println("resultado = " + resultado);
    }
}
