
public class Tema2 {
    public static void main(String[] args) {
        var numero= "c";
    var numeroTexto = "Numero desconocido";
    
    switch(numero){
        case 1:
            numeroTexto = "Numero uno";
            break;
         case 2:
            numeroTexto = "Numero dos";
            break;
         case 3:
            numeroTexto = "Numero tres";
            break;
         default:
             numeroTexto = "No se encontro";
    }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
