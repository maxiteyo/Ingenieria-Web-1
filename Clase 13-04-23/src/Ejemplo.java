
public class Ejemplo {

    public int x;//si le pongo private da error
    public int a;//si le pongo private da error

    public void hacerAlgo() {
        x = 1 + a * 3;
    }

    public int suma() {
        return x + a;
    }

    public void imprimir() {
        System.out.println("x=" + x + " a= " + a + "\n");
    }

}
