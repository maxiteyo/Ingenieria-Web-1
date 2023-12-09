//un metodo esta sobrecargado cuando admite recibir mas de una combinacion de tipos y/o cantidades de argumentos. En este caso admite cadena o ingresar directamente los enteros
public class Fecha {

    private int dia;
    private int mes;
    private int anio;
    
    public Fecha(String s){
        
        int pos1= s.indexOf('/');
        int pos2= s.lastIndexOf('/');
        
        String sDia = s.substring(0, pos1);
        dia= Integer.parseInt(sDia);
        
        String sMes = s.substring(pos1+1, pos2);
        mes= Integer.parseInt(sMes);
        
        String sAnio = s.substring(pos2+1);
        anio= Integer.parseInt(sAnio);
        
    }
    
    public Fecha(int d,int m,int a){
        dia= d;
        mes= m;
        anio= a;
    }
    
    public Fecha(){
    }
    
    public String toString(){
        
        return dia + "/" + mes + "/" + anio;
    }
    
    public boolean equals(Object o){
        Fecha otra = (Fecha)o;
        return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
    }
    
    public void setDia(int d){
        dia=d;
    }
    
    public int getDia(){
        return dia;
    }
    
    public void setMes(int m){
        mes=m;
    } 
    
    public int getMes(){
        return mes;
    }
    
    public void setAnio(int a){
        anio=a;
    }
    
    public int getAnio(){
        return anio;
    }
}
