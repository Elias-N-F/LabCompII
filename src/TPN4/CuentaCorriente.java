/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN4;

/**
 *
 * @author Usuario
 */
public class CuentaCorriente {
    double saldo;
    String nombreTitular;
    long nroCuenta;

    public CuentaCorriente(String nombreTitular,double saldo) {
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
        nroCuenta= (long) (Math.random()*100);
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositarDinero(double saldo) {
        this.saldo = this.saldo + saldo;
    }
    
     public void retirarDinero(double saldo) {
        this.saldo = this.saldo - saldo;
    } 
     
    public String getDatos() {
        return "----------------------------------\n"
                +"Nombre: "+this.nombreTitular
                +"\nSaldo: $"+this.saldo
                +"\nNumero de cuenta: "+this.nroCuenta
                +"\n----------------------------------";
    }

    public static void realizarTransferencia(CuentaCorriente c1, CuentaCorriente c2, double saldo){
        if (c1.saldo>0){
        c1.retirarDinero(saldo);
        c2.depositarDinero(saldo);
        System.out.println("Operación satisfactoria");}
        else System.out.println("Error, saldo insuficiente");
    }   
    
    
}
