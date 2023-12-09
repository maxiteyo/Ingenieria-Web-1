
import java.util.Scanner;

class Tema4 {
    public static void main(String[] args) {
        var edad = Integer.parseInt("20");//convertir un string a entero
        System.out.println("edad = " +edad );

        var valorPi = Double.parseDouble("3.1415"); //interpreta la cadena como un double
        System.out.println("valorPi = " + valorPi);
        
        var consola = new Scanner(System.in);
//        System.out.print("Proporciona una edad: ");
//        edad= Integer.parseInt(consola.nextLine());
//        System.out.println("consola edad= " + edad);
        var edadTexto = String.valueOf(10);//convierte entero a string
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(1);//
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporcione un caracter: ");//por mas que el usuario escriba una palabra saca el primer caracter
        caracter = consola.nextLine().charAt(0);//si se cambia el numero trae distintoscaracteres teniendo en cuente el nro que esta
        System.out.println("caracter = " + caracter);
        
}
}
