
public class Tema8 {
//Funcion recursiva
static void funcionRecursiva(int numero){
    //Caso Base
    if(numero == 1)
        System.out.println(numero);
    else{
        //Caso recursivo
        funcionRecursiva( numero - 1);
        System.out.println(numero);
    }
}
    public static void main(String[] args) {
        //Imprimir del 1 al 5 de manera recursiva
        funcionRecursiva(5);//si cambio el numero cambia lo que imprime
    }
}
