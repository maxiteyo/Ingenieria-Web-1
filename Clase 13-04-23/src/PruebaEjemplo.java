
public class PruebaEjemplo {

    public static void main(String[] args) {
        Ejemplo e;
        Ejemplo f;

        e = new Ejemplo(); //instancia "e" de la clase Ejemplo
        f = new Ejemplo(); //instancia "f" de la clase Ejemplo
        e.a = 7;
        e.hacerAlgo();//e.x=22
        f.x = e.suma();//f.x=29
        f.a = f.x + e.a;//f.a=36
        e.a = f.suma();//e.a=65
        e.imprimir();
        f.imprimir();
    }
}
