
public class Tema2 {
    public static void main(String[] args) {
        var numero = 1;
        var numeroTexto = "Numero desconocido";
        
        if (numero == 1){
            numeroTexto = "Numero uno";
        }else if (numero == 2){
            numeroTexto = "Numero dos";
        }else if (numero == 3){
            numeroTexto = "Numero tres";
        }else {
            numeroTexto = "Fuera de rango";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        
    }
}
