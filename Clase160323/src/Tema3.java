
public class Tema3 {

    public static void main(String[] args) {

        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {//si varBoolean es true entra aca ... Si es una sola sentencia se puede omitir las llaves
            System.out.println("La variable es verdadera");

        } else {//si es false entra aca
            System.out.println("La variable es falsa");
        }

        var edad = 10;

        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
    }
}
