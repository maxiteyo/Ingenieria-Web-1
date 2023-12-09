
public class Tema3b {
    public static void main(String[] args) {
        
        int[][] matriz = {
            {100,200,300,700},
            {400,500,600,800}
        };
        
        System.out.println("Imprimir la matriz completa: ");
        for(int ren=0 ; ren < matriz.length ; ren++){
            for(int col=0 ; col < matriz[ren].length ; col++){
                System.out.print(" Matriz["+ren+"]["+col+"]= " +matriz[ren][col]);
            }
            System.out.println();
        }
    }
}
