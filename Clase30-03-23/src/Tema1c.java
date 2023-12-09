
public class Tema1c {
    public static void main(String[] args) {
        int enteros[] = {100,200,300,400,500};
        //float[] enteros = new float[5];
        System.out.println("Largo arreglo:" +enteros.length);
        for(int i=0;i<enteros.length;i++){
            System.out.println("enteros["+i+"]= "+enteros[i]);
        }
        
        System.out.println("Usando for each");
        
        for(var numero: enteros)
            System.out.println("Valor: "+ numero);//la variable numero sabe que es un arreglo y se lo asigno
    }
}
