
public class Tema1 {
    public static void main(String[] args) {
        //Obtener el largo de una cadena
        var cadena = "Hola Mundo";
        System.out.println("Largo cadena: " + cadena.length());//cuenta los espacios
        
        //Recorrer la cadena
        for(int i = 0; i < cadena.length(); i++){
            System.out.println(i + " - " + cadena.charAt(i));
        }
    }
    
}
