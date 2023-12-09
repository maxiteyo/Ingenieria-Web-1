
public class Encapsulamiento {

    private int dia;
    private int mes;
    private int anio;

    private int fechaToDias() {
        return anio * 360 + mes * 30 + dia;
    }

    private void diasToFecha(int i) {

        anio = (int) i / 360;

        int resto = i % 360;

        mes = (int) resto / 30;

        dia = resto % 30;

        if (dia == 0) {
            dia = 30;
            mes--;
        }

        if (mes == 0) {
            mes = 12;
            anio--;
        }
    }

    public void addDias(int d) {

        int sum = fechaToDias() + d;

        diasToFecha(sum);
    }

    public Encapsulamiento(String s) {

        int pos1 = s.indexOf('/');
        int pos2 = s.lastIndexOf('/');

        String sDia = s.substring(0, pos1);
        dia = Integer.parseInt(sDia);

        String sMes = s.substring(pos1 + 1, pos2);
        mes = Integer.parseInt(sMes);

        String sAnio = s.substring(pos2 + 1);
        anio = Integer.parseInt(sAnio);

    }

    public Encapsulamiento(int d, int m, int a) {
        dia = d;
        mes = m;
        anio = a;
    }

    public Encapsulamiento() {
    }
    
    public String toString(){
        return dia+"/"+mes+"/"+anio;
    }
}
