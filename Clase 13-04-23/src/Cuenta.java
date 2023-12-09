
import java.util.Scanner;


public class Cuenta {
   public String nombre;
   private double saldo;
   private int numero;
   public String tipo;

   public void setSaldo(double a){
       saldo= a;
   }
   //public void setSaldo(double saldo){
   //    this.saldo= saldo;
   //}
   public double getSaldo(){
    return saldo;
   }
   
   public void setNumero(int num){
       numero= num;
   }
//   public void setNumero(int numero){
//       this.numero= numero;
//   }
   public int getNumero(){
    return numero;
   }
   
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
 
   //PARA SALDO Y NUMERO EN PRIVATE
   
   
   
   
}
