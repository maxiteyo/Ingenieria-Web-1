
public class Tema2 {
    public static void main(String[] args) {
        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);
        //subcadena hola y mundo
        //substring(indice_inicio,indice_fin - 1)
        //substring al ejecutarse incluye el indice de inicio
        //pero el indice final llega hasta indice final -1
        var subcadena1 = cadena.substring(0,4);
        System.out.println("Subcadena1 = " + subcadena1);
        var subcadena2 = cadena.substring(5,10);
        System.out.println("Subcadena2 = " + subcadena2);
    }
}
