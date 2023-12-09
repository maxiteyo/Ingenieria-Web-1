
public class Tema5 {
    public static void main(String[] args) {
        //Convertir numero a cadena/texto
        int a = 10, b = 20;
        // Imprime la suma
        System.out.println(a+b);
        // Convertimos los valores enteros a tipo cadena
        System.out.println(String.valueOf(a) + Integer.toString(b));//son dos formas de convertir numero a cadena
        //Otra forma es usando String format
        String resultado = String.format("%d %d", a, b);//sin el espacio queda igual al otro
        System.out.println(resultado);
        
    }
}
