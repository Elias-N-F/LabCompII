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
public class UsoCuenta {
    public static void main (String[] args){
    CuentaCorriente Cuenta1= new CuentaCorriente("Juan", 300);
    CuentaCorriente Cuenta2= new CuentaCorriente("Rodrigo", 0);
    System.out.println(Cuenta1.getDatos());
    System.out.println(Cuenta2.getDatos());
    CuentaCorriente.realizarTransferencia(Cuenta1, Cuenta2, 200);
    System.out.println(Cuenta1.getDatos());
    System.out.println(Cuenta2.getDatos());
    
     }
}
