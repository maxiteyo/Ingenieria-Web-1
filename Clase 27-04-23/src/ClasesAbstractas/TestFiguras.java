
package ClasesAbstractas;


public class TestFiguras {
    
    public static void main(String[] args) {
        
        
        FiguraGeometrica arr[] = {new Rectangulo(10,5), new Triangulo(3,6)};
        
//        System.out.println(r);
//        System.out.println(t);
        
        double prom = FiguraGeometrica.areaPromedio(arr);
        
        System.out.println("Promedio = " + prom);
        
    }
    
}
