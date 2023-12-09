
public class Tema7 {
// Atributo de instancia de la clase (objeto)
int i = 5;
//Atributo de la clase
static int atributoClase = 10;

    public static void main(String[] args) {
        //Variables local al metodo main
        var variableLocal = 20;
        System.out.println("Variable local: " + variableLocal);
        System.out.println("Variable clase: " + atributoClase);
        System.out.println("Variable instancia (objeto): " + new Tema7().i);//creo el objeto a partir de la clase
    }
}
