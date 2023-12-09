
public class arreglo {
    public static void main(String[] args) {
        int[][] arreglo = {
    {1,2,3,4,5},
    {6,7,8,9,10},
    {11,12,13,14,15}};
    for(int ren=0; ren < arreglo.length; ren++){
    for(int col=0; col < arreglo[ren].length; col++){
        System.out.print(" arreglo["+ren+"]["+col+"] = " + arreglo[ren][col]);
    }
        System.out.println();
    }
   }
}


