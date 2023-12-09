
public class EjemploCuenta {

    public static void main(String[] args) {
        Cuenta cuentaCredito;
        Cuenta cuentaDebito;
        
        //creamos los objetos
        cuentaCredito= new Cuenta();
        cuentaDebito= new Cuenta();
        
        cuentaCredito.nombre = "Pedro Sanchez";
        cuentaCredito.setSaldo(1500);
        cuentaCredito.setNumero(244513);
        cuentaCredito.tipo= "Credito";
        
        cuentaDebito.nombre= "Pablo Garcia";
        cuentaDebito.setSaldo(7800);
        cuentaDebito.setNumero(273516);
        cuentaDebito.tipo= "Debito";
        
        cuentaCredito.imprimir();
        System.out.print("\n");
        cuentaDebito.imprimir();
        
        
        
    }
}
