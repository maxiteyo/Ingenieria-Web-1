package Tema7;

//se heredan atributos y metodos, pero no se heredan los constructores. LOS CONSTRUCTORES NO SE HEREDAN, POR ESO SE USA "SUPER".
public class FechaDetallada extends Fecha {

    private static String meses[] = {"Enero",
        "Febrero",
        "Marzo",
        "Abril",
        "Mayo",
        "Junio",
        "Julio",
        "Agosto",
        "Septiembre",
        "Octubre",
        "Noviembre",
        "Diciembre"};

//    public FechaDetallada() {
//    
//    }
//
//    public FechaDetallada(int d, int m, int a) {
//        setDia(d);
//        setMes(m);
//        setAnio(a);
//    }
//
//    public String toString() {
//        return getDia() + " de " + meses[getMes() - 1] + " de " + getAnio();
//    }
    
    
    //PARA NO TENER QUE ESCRIBIR TODO LO ANTERIOR, USAMOS "SUPER"
    
    public FechaDetallada(int dia, int mes, int anio){
        
        super(dia,mes,anio);
    }
    
    public FechaDetallada(String s){
        
        super(s);
    }
    
    public FechaDetallada(){
        
        super();
    }
    
    
}
