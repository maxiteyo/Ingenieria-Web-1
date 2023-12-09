import java.util.Scanner;

public class EncapsulamientoTest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Ingrese Fecha (dd/mm/aaaa)");
        String sFecha= scanner.nextLine();
        
        Encapsulamiento f= new Encapsulamiento(sFecha);
        
        System.out.println("La fecha ingresada es: " +f);
        
        System.out.println("Ingrese dias a sumar (puede ser negativo): ");
        int diasSum = scanner.nextInt();
        
        f.addDias(diasSum);
        
        System.out.println("sumando "+ diasSum + " dias, queda " +f);
    }
}
