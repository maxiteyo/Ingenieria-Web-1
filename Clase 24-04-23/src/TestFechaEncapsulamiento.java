
import java.util.Scanner;

public class TestFechaEncapsulamiento {
    public static void main(String[] args) {
        
        Scanner consola= new Scanner(System.in);
        
        System.out.println("Ingrese Fecha (dd/mm/aaaa)");
        String sFecha= consola.nextLine();
        
        Fecha f= new Fecha(sFecha);
        
        System.out.println("La fecha ingresada es: " +f);
        
        System.out.println("Ingrese dias a sumar (puede ser negativo): ");
        int diasSum = Integer.parseInt(consola.nextLine());
        
        f.addDias(diasSum);
        
        System.out.println("sumando "+ diasSum + " dias, queda " +f);
        
        
    }
 
}
