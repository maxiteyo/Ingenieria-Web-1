//se heredan atributos y metodos, pero no se heredan los constructores
public class FechaDetallada extends Fecha{
    private static String meses[]= {"Enero",
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
    
    public FechaDetallada(){
}
    public FechaDetallada(int d,int m,int a){
        setDia(d);
        setMes(m);
        setAnio(a);
    }
    public String toString(){
        return getDia() + " de " + meses[getMes() - 1] + " de " + getAnio();
    }
}
