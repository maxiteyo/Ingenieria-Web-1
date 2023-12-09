package ClasesAbstractas;

public abstract class FiguraGeometrica {

    private String nombre;
    //metodo abstracto
    public abstract double area();

    public FiguraGeometrica(String nom){
        
        nombre= nom;   
    }
    
    public static double areaPromedio(FiguraGeometrica arr[]){
        int sum=0;
        for(int i=0 ; i<arr.length;i++){
            sum += arr[i].area(); //equivale a suma= suma+ arr[i].area();
        }
        return sum/arr.length;
    }
    
    public String toString() {
        return nombre +" (area = " + area()+") ";
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
}
