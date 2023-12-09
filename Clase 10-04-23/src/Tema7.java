import java.util.Scanner;
        
public class Tema7 {
    public static void main(String[] args) {
        System.out.println("Proporciona un valor numerico: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        var numeroAbs = Math.abs(numero);
        System.out.println("Valor absoluto de " + numero + " es: " + numeroAbs);
    }
}
