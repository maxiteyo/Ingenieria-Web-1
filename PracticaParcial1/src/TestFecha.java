
public class TestFecha {
    public static void main(String[] args) {
        
        //cremos una fecha a partir de los tres valores por separado
        Fecha f= new Fecha(25,10,2004);
        //creamos una feha a partir de una cadena con formato dd/mm/aaaa
        Fecha f2= new Fecha("25/10/2004");
        
        //imprimimpos el dia
        System.out.println("Dia= "+f.getDia());
        //imprimimos el mes
        System.out.println("Mes= "+f.getMes());
        //imprimimos el anio
        System.out.println("Anio= "+f.getAnio());
        
        //imprimimos la fecha
        System.out.println(f);
        System.out.println(f2);
        System.out.println("Son iguales f1 y f2? "+f.equals(f2));
        
    }
}
