
import java.util.Scanner;


public class ActividadPractica {
    
    public static void main(String[] args) {
        var consola= new Scanner(System.in);
        System.out.print("Ingrese descripcion del producto: ");
        var descripcion= " ";
        descripcion=consola.nextLine();
        System.out.println("Descripcion del producto: " + descripcion);
        
        var idProducto= "0";  
        System.out.print("Ingrese id del producto: ");
        idProducto= consola.nextLine();
        System.out.println("El id del producto es: " + idProducto );
        
        var Precio="0";
        System.out.println("Ingrese precio del producto: ");
        Precio=consola.nextLine();
        System.out.println("El precio del producto es: $"+Precio);
        
        var Envio=" ";
        System.out.println("¿Tiene envio gratis? si/no");
        Envio= consola.nextLine();
        
        
        
    }
    
}
