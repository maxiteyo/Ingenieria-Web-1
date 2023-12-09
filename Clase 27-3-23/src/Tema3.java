
public class Tema3 {

    public static void main(String[] args) {
        var mes = 12;
        var estacion = "Estacion desconocida";

        switch (mes) {
            //case 1,2,3 -> estacion = "Verano";
            case 1,2,12:
                estacion = "Verano";
                break;
            case 3,4,5:
                estacion = "Otoño";
                break;
            case 6,7,8:
                estacion = "Invierno";
                break;
            case 9,10,11:
                estacion = "Primavera";
                break;
        }
        System.out.println("estacion = " + estacion);
    }
}
