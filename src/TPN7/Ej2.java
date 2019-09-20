/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPN7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ej2 {
    public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    int r;
    
        System.out.println("Ingrese un numero entre 1 y 100");
        r= sc.nextInt();
        revisar(r);
    
    }

public static void revisar(int d) {
    
    if (d<1||d>100){
        throw new ExcepcionPropia("El numero ingresado está fuera del rango");
    
    }
    else{System.out.println("Usted ingresó el numero: "+d);}
    

}
}

