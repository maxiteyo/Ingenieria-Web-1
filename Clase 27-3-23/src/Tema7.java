
public class Tema7 {
    public static void main(String[] args) {
         for(var contador = 0; contador < 7; contador++ ){
            if(contador == 3){//cuando llega a 3 sale del loop (salida poco elegante, deberia salir por la condicion que se cumpla)
            continue;
            }
            System.out.println("contador = " + contador);
        }
    }
    
}
