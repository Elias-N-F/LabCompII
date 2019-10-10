/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN9;

/**
 *
 * @author Usuario
 */
public class Numero implements Operaciones{
    int n1;
    int n2;
    String tipo;
    
    public Numero(int n1) {
        this.n1=n1;
        this.tipo= "Natural";
    
    }
    
    
    public Numero(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
        this.tipo= "Complejo";
    }
    
    @Override
    public Numero SUMAR(Numero r, Numero e) {
        
        if("Natural".equals(r.tipo)&&"Natural".equals(e.tipo)){
           Numero x= new Numero((r.n1+e.n1));
           return x;
        }
        else if("Complejo".equals(r.tipo)&&"Complejo".equals(e.tipo)){
           Numero x= new Numero((r.n1+e.n2),(r.n2+e.n1));
           return x;
        }
        else{
            System.out.println("Los numeros son incompatibles");
            return null;}
    }

    @Override
    public Numero RESTAR(Numero r, Numero e) {
        
    return null;
    }

    @Override
    public Numero MULTIPLICAR(Numero r, Numero e) {
        
    return null;
    }
    
}