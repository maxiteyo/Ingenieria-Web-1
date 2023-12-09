
public class Tema1b {
    public static void main(String[] args) {
        int[] enteros = {100,200,300,400,500};
        //float[] enteros = new float[5];
        
      //  enteros[0]= 13;
        //enteros[1]= 5;
        //enteros[4]= 4;
        
        System.out.println("Valor 0 del arreglo= " +enteros[0]);
        System.out.println("Valor 1 del arreglo= " +enteros[1]);
        System.out.println("Valor 2 del arreglo= " +enteros[2]);//por default java pone un 0 en los elementos del arrelgo no asignados
        System.out.println("Valor 3 del arreglo= " +enteros[3]);
        System.out.println("Valor 4 del arreglo= " +enteros[4]);
        
        System.out.println("Arreglo enteros = " +enteros);//imprime la direccion de memoria del primer elemento del arreglo
        //la direccion de memoria tiene un corchete, y luego una letra con el tipo de variable(I para entero,F para flotante,etc)
    }
}
