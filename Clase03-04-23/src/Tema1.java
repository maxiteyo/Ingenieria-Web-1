
public class Tema1 {
    public static void main(String[] args) {
        //PREFERIBLE NO USAR(etiquetas) pasa de la linea 8 a la linea 5
        inicio:
        for(var contador = 0 ; contador < 3 ; contador++){
            if(contador % 2 != 0){
                continue inicio;
            }
            System.out.println("contador: " +contador);
        }
        
    }
}
