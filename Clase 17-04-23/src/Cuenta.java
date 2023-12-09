
public class Cuenta {
    
   public String nombre;
   public double saldo;
   public int numero;
   public String tipo;
    
   public Cuenta(String n, double s,int num, String t){
       nombre = n;
       saldo = s;
       numero = num;
       tipo = t;
   }
//   public Cuenta(String nombre, double saldo,int numero, String tipo){
//       this.nombre = nombre;
//       this.saldo = saldo;
//       this.numero = numero;
//       this.tipo = tipo;
//   }
   
    public void depositar(double deposito){
       saldo = saldo + deposito;
   }
   
   
   public void retirar(double retiro){
       if(saldo>=retiro){
       saldo = saldo - retiro;
       }
   }
   
   public void imprimir(){
       System.out.println("Nombre= " + nombre);
       System.out.println("Saldo= " + saldo);
       System.out.println("Numero= " + numero);
       System.out.println("Tipo= " + tipo);
   }
}
