//el FOR se ejecuta un numero definido de veces
public class Tema6 {
    public static void main(String[] args) {

        for(var contador = 0; contador < 5; contador++ ){
            if(contador % 2 != 0){
                continue; //Ir a la siguiente iteracion (se saltea todas las sentencias que hay hasta el final del FOR)
            }
            System.out.println("contador = " + contador);
        }
        
    }
}
