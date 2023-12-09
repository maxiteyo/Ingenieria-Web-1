import java.util.Random;

public class Tema6 {
    public static void main(String[] args) {
       // Generamos un valor aleatorio
       // Creamos un objeto random
       var aleatorio = new Random();
       //Generamos los valores entre 0 y 100 (no incluye el limite)
       int valorAleatorio = aleatorio.nextInt(100+1);//el numero hasta donde quiero que llegue mas uno
        System.out.println("Valor aleatorio entre (0 y 100): " + valorAleatorio);
    }
}
