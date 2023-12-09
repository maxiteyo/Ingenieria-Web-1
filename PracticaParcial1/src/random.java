
import java.util.Random;

public class random {

    public static void main(String[] args) {

        var aleatorio = new Random();
        var numero = aleatorio.nextInt(5 + 1);//numero random entre 0 y 5
        System.out.println("Numero aleatorio: " + numero);

    }

}
